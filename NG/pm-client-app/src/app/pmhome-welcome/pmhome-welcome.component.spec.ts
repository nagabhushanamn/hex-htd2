import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PMHomeWelcomeComponent } from './pmhome-welcome.component';

describe('PMHomeWelcomeComponent', () => {
  let component: PMHomeWelcomeComponent;
  let fixture: ComponentFixture<PMHomeWelcomeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PMHomeWelcomeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PMHomeWelcomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
