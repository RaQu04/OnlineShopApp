import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { RouterModule, Routes } from '@angular/router';

import { AppComponent } from './app.component';
import { NavComponent } from './nav/nav.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HomeComponent } from './home/home.component';
import { CategoryComponent } from './category/category.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';

const routesHome: Routes = [{ path: 'home', component: HomeComponent }]
const routesCategory: Routes = [{ path: 'category', component: CategoryComponent }]
const routesAbout: Routes = [{ path: 'about', component: AboutComponent }]
const routesContact: Routes = [{ path: 'contact', component: ContactComponent }]

@NgModule({
  declarations: [
    AppComponent,
    NavComponent,
    HomeComponent,
    CategoryComponent,
    AboutComponent,
    ContactComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatButtonModule,
    MatIconModule,
    RouterModule.forRoot(routesHome),
    RouterModule.forRoot(routesCategory),
    RouterModule.forRoot(routesAbout),
    RouterModule.forRoot(routesContact)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
