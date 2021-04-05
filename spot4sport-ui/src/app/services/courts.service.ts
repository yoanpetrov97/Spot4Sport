import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Court} from "../components/models/court";
import {environment} from "../../environments/environment";

@Injectable({
    providedIn: "root"
})
export class CourtsService {
    private courtsUrl: string = `${environment.api}/courts`;

    constructor(private http: HttpClient) { }

    async getAllCourts(): Promise<Court[]> {
        return await this.http.get(this.courtsUrl).toPromise() as Court[];
    }

    async addNewCourt(courtName: string): Promise<Court> {
        return await this.http.post(this.courtsUrl, courtName).toPromise() as Court;
    }
}
