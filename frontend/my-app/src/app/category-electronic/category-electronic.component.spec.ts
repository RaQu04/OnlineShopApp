import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CategoryElectronicComponent } from './category-electronic.component';

describe('CategoryElectronicComponent', () => {
  let component: CategoryElectronicComponent;
  let fixture: ComponentFixture<CategoryElectronicComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CategoryElectronicComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CategoryElectronicComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
