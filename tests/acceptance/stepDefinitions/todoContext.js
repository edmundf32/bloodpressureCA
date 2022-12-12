const {Given, When, Then} = require('@cucumber/cucumber')
// import expect for assertion
const { expect } = require("@playwright/test")

//launch url
const url = 'http://bloodpressure.wnlcloud.com'
//const url = 'http://localhost:8080'



Given('a user has navigated to the homepage', async function () {
    // navigate to the app
    await page.goto(url)
    // locat the element in the webUI
    const locator = page.getByRole('heading')
    // assert that it's visible
    expect(locator).toBeVisible()
    await page.getByRole('link', { name: 'Click here to calculate' }).click()
})

When('the user adds their systolic and dystolic and clicks calculate', async function () {
    const calculateHeader = page.getByRole('heading')
    expect(calculateHeader).toBeVisible()
    await page.locator('#systolic').click()
    await page.locator('#systolic').fill('70')
    await page.locator('#diastolic').click()
    await page.locator('#diastolic').fill('100')
    // click the button
    await page.getByRole('button', { name: 'Calculate' }).click()
    
})

Then('their bloodpressure should be displayed',async function () {
    
    await page.getByText('Ideal')
    const bpResult = page.locator()
    expect(bpResult).toContainText("Ideal") 
})