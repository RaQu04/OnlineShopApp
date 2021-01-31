import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { RouterModule, Routes } from '@angular/router';
import { MatInputModule } from '@angular/material/input';
import {MatCardModule} from '@angular/material/card';
import {MatProgressSpinnerModule} from '@angular/material/progress-spinner';


import { AppComponent } from './app.component';
import { NavComponent } from './nav/nav.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HomeComponent } from './home/home.component';
import { CategoryComponent } from './category/category.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
import { BasketComponent } from './basket/basket.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { LoginPanelComponent } from './login-panel/login-panel.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { MenuComponent } from './menu/menu.component';
import {MatListModule} from '@angular/material/list';
import {MatGridListModule} from '@angular/material/grid-list';
import { GridListComponent } from './grid-list/grid-list.component';
import { ProgressSpinnerComponent } from './progress-spinner/progress-spinner.component';
import { AdPanelComponent } from './ad-panel/ad-panel.component';
import { ShoppingBasketComponent } from './shopping-basket/shopping-basket.component';
import { ShoppingItemComponent } from './shopping-item/shopping-item.component';
import {MatMenuModule} from '@angular/material/menu';



const routes: Routes = [
  { path: '', redirectTo: '/home', pathMatch: 'full' },
  { path: 'home', component: HomeComponent },
  { path: 'category', component: CategoryComponent },
  { path: 'about', component: AboutComponent },
  { path: 'contact', component: ContactComponent },
  { path: 'basket', component: BasketComponent },
  { path: 'login', component: LoginPanelComponent }];

@NgModule({
  declarations: [
    AppComponent,
    NavComponent,
    HomeComponent,
    CategoryComponent,
    AboutComponent,
    ContactComponent,
    BasketComponent,
    LoginPanelComponent,
    MenuComponent,
    GridListComponent,
    ProgressSpinnerComponent,
    AdPanelComponent,
    ShoppingBasketComponent,
    ShoppingItemComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatButtonModule,
    MatListModule,
    MatIconModule,
    MatInputModule,
    MatGridListModule,
    MatCardModule,
    MatMenuModule,
    MatProgressSpinnerModule,
    FormsModule,
    RouterModule.forRoot(routes),
    NgbModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}


