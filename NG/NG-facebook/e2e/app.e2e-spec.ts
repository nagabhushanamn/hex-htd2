import { NGFacebookPage } from './app.po';

describe('ng-facebook App', () => {
  let page: NGFacebookPage;

  beforeEach(() => {
    page = new NGFacebookPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!!');
  });
});
