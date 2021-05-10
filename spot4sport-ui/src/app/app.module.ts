import {BrowserModule} from "@angular/platform-browser";
import {NgModule} from "@angular/core";

import {AppComponent} from "./app.component";
import {NgbModule} from "@ng-bootstrap/ng-bootstrap";
import {CourtsComponent} from "./components/courts/courts.component";
import {HttpClientModule} from "@angular/common/http";
import {RouterModule} from "@angular/router";

@NgModule({
    declarations: [
        AppComponent,
        CourtsComponent
    ],
    imports: [
        BrowserModule,
        NgbModule,
        HttpClientModule,
        RouterModule.forRoot([
            {
                path: "courts",
                component: CourtsComponent
            },
        ]),
    ],
    providers: [],
    bootstrap: [AppComponent]
})
export class AppModule {
}
