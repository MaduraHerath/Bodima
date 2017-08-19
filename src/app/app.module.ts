import { BrowserModule } from '@angular/platform-browser';
import { NgModule, ModuleWithProviders } from '@angular/core';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';


import { RouterModule, Routes } from '@angular/router';


import { FormsModule }    from '@angular/forms';
import { HttpModule, JsonpModule } from '@angular/http';
import { HeaderComponent } from './header/header.component';
import { SearchComponent } from './search/search.component';


/*Routes*/
export const appRoute: Routes = [
{path: '' , component: HomeComponent} ,
{ path: 'search',      component: SearchComponent },
]

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    HeaderComponent,
    SearchComponent,
  ],
  imports: [
     RouterModule.forRoot(appRoute),
    BrowserModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})

export class AppModule { }
export const routing: ModuleWithProviders = RouterModule.forRoot(appRoute);