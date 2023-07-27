import { Component, OnInit } from '@angular/core';
import {Route, Router} from '@angular/router';
import { Observable } from 'rxjs';
import {Processing} from "../core/Models/processing-model";
import {ProcessingService} from "../core/services/processing-service";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {RequestsServiceService} from "../services/requests-service.service";

@Component({
  selector: 'app-consent',
  templateUrl: './consent.component.html',
  styleUrls: ['./consent.component.scss']
})

export class ConsentComponent implements OnInit{
 processings!: Processing[];
 categoryId!: any;
 idRef!: string;
  constructor(private processingService: ProcessingService, private requestsService: RequestsServiceService, private router: Router){}
  ngOnInit(): void {
    //this.processings = this.processingService.remplirAttributProcessings(1);
    this.processingService.setProcessings(this.processings);

  }
  onSubmitForm() {
    this.router.navigateByUrl(`contract`);
  }

  DataSubject(idRef: string): any {
    return this.requestsService.getDataSubject(idRef);
  }

  getDscIdRef(idRef:string): any {
    this.DataSubject(idRef).subscribe({
      next: (data: any) => {
        this.categoryId = data.dscId;
        this.processings = this.processingService.remplirAttributProcessings(this.categoryId);
        this.processingService.setProcessings(this.processings);
        }});
      }
}
