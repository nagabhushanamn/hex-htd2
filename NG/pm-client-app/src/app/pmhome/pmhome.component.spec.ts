import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PMHomeComponent } from './pmhome.component';

describe('PMHomeComponent', () => {
  let component: PMHomeComponent;
  let fixture: ComponentFixture<PMHomeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PMHomeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PMHomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
