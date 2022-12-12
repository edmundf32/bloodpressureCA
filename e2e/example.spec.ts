import { test, expect } from '@playwright/test';

test('test', async ({ page }) => {
  await page.goto('http://bloodpressure.wnlcloud.com/');
  await page.getByRole('link', { name: 'Click here to calculate' }).click();
  await page.locator('#systolic').click();
  await page.locator('#systolic').fill('050');
  await page.locator('#systolic').press('Tab');
  await page.locator('#diastolic').fill('80');
  await page.getByRole('button', { name: 'Calculate' }).click();
  await page.getByText('Low').click();
  await expect(page.locator('.result')).toHaveText('Submitted');
});