import { PmClientAppPage } from './app.po';

describe('pm-client-app App', () => {
  let page: PmClientAppPage;

  beforeEach(() => {
    page = new PmClientAppPage();
  });

  it('should display welcome message', done => {
    page.navigateTo();
    page.getParagraphText()
      .then(msg => expect(msg).toEqual('Welcome to app!!'))
      .then(done, done.fail);
  });
});
