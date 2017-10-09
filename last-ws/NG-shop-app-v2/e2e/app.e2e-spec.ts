import { ShopAppV2Page } from './app.po';

describe('shop-app-v2 App', () => {
  let page: ShopAppV2Page;

  beforeEach(() => {
    page = new ShopAppV2Page();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!!');
  });
});
