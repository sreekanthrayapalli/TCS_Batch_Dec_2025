import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplayEmployeeData } from './display-employee-data';

describe('DisplayEmployeeData', () => {
  let component: DisplayEmployeeData;
  let fixture: ComponentFixture<DisplayEmployeeData>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [DisplayEmployeeData]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DisplayEmployeeData);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
