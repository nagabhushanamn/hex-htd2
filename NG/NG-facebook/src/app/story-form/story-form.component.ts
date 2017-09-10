import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-story-form',
  templateUrl: './story-form.component.html',
  styleUrls: ['./story-form.component.css']
})
export class StoryFormComponent implements OnInit {

  storyForm: FormGroup

  @Output()
  story = new EventEmitter();

  constructor(private fb: FormBuilder) { }

  ngOnInit() {
    this.storyForm = this.fb.group({
      name: ['', Validators.required],
      story: ['', Validators.required]
    });
  }

  handleStorySubmit() {
    this.story.emit(this.storyForm.value);
    this.storyForm.reset();
  }


}
