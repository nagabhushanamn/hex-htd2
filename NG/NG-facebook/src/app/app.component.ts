import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';
  isFormOpen: boolean = false

  storyList: Array<any> = [];

  toggleStoryForm() {
    this.isFormOpen = !this.isFormOpen;
  }

  handleNewStory(story) {
    this.storyList.push(story)
    this.isFormOpen = false;
  }


}
