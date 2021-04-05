import {Component, OnInit} from "@angular/core";
import {CourtsService} from "../../services/courts.service";
import {Court} from "../models/court";

@Component({
    selector: "app-courts",
    templateUrl: "./courts.component.html",
    styleUrls: ["./courts.component.scss"]
})
export class CourtsComponent implements OnInit {
    courts: Court[] = [];

    constructor(private courtsService: CourtsService) { }

    async ngOnInit(): Promise<void> {
        this.courts = await this.getAllCourts();
    }

    getAllCourts(): Promise<Court[]> {
        return this.courtsService.getAllCourts();
    }

    addNewCourt(courtName: string): Promise<Court> {
        return this.courtsService.addNewCourt(courtName);
    }
}
