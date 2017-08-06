import { BordimaWebPage } from './app.po';

describe('bordima-web App', () => {
  let page: BordimaWebPage;

  beforeEach(() => {
    page = new BordimaWebPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
