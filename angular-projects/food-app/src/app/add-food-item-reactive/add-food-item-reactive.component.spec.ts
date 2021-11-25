import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddFoodItemReactiveComponent } from './add-food-item-reactive.component';

describe('AddFoodItemReactiveComponent', () => {
  let component: AddFoodItemReactiveComponent;
  let fixture: ComponentFixture<AddFoodItemReactiveComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddFoodItemReactiveComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddFoodItemReactiveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
