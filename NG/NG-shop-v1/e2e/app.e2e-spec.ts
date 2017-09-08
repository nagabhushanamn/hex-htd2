import { NGShopV1Page } from './app.po';

describe('ng-shop-v1 App', () => {
  let page: NGShopV1Page;

  beforeEach(() => {
    page = new NGShopV1Page();
  });

  it('should display welcome message', done => {
    page.navigateTo();
    page.getParagraphText()
      .then(msg => expect(msg).toEqual('Welcome to app!!'))
      .then(done, done.fail);
  });
});
