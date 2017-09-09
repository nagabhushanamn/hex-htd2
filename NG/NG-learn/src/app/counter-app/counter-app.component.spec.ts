import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CounterAppComponent } from './counter-app.component';

describe('CounterAppComponent', () => {
  let component: CounterAppComponent;
  let fixture: ComponentFixture<CounterAppComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CounterAppComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CounterAppComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
