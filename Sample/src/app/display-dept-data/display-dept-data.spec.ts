import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplayDeptData } from './display-dept-data';

describe('DisplayDeptData', () => {
  let component: DisplayDeptData;
  let fixture: ComponentFixture<DisplayDeptData>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [DisplayDeptData]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DisplayDeptData);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
