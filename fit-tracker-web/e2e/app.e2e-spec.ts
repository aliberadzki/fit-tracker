import { FitTrackerWebPage } from './app.po';

describe('fit-tracker-web App', function() {
  let page: FitTrackerWebPage;

  beforeEach(() => {
    page = new FitTrackerWebPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
