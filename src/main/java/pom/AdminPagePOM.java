package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class AdminPagePOM {
	
		@FindBy(xpath = "//span[text()='Admin']")
		WebElement adminButton;
		
		@FindBy(xpath = "//span[text()='User Management ']")
		WebElement userManagementDropdown;
		
		@FindBy(xpath = "//a[text()='Users']")
		WebElement userOption;
		
		@FindBy(xpath = "//span[text()='Job ']")
		WebElement jobDropdown;
		
		@FindBy(xpath = "//a[text()='Job Titles']")
		WebElement jobTitles;
		
		@FindBy(xpath = "//a[text()='Pay Grades']")
		WebElement payGrades;
		
		@FindBy(xpath = "//a[text()='Employment Status']")
		WebElement employmentStatus;
		
		@FindBy(xpath = "//a[text()='Job Categories']")
		WebElement jobCategories;
		
		@FindBy(xpath = "//a[text()='Work Shifts']")
		WebElement workShifts;
		
		@FindBy(xpath = "//span[text()='Organization ']")
		WebElement organizationDropdown;
		
		@FindBy(xpath = "//a[text()='General Information']")
		WebElement generalInformation;
		
		@FindBy(xpath = "//a[text()='Locations']")
		WebElement locations;
		
		@FindBy(xpath = "//a[text()='Structure']")
		WebElement structure;
		
		@FindBy(xpath = "//span[text()='Qualifications ']")
		WebElement qualificationDropdown;
		
		@FindBy(xpath = "//a[text()='Skills']")
		WebElement skills;
		
		@FindBy(xpath = "//a[text()='Education']")
		WebElement education;
		
		@FindBy(xpath = "//a[text()='Licenses']")
		WebElement licenses;
		
		@FindBy(xpath = "//a[text()='Languages']")
		WebElement languages;
		
		@FindBy(xpath = "//a[text()='Memberships']")
		WebElement membership;
		
		@FindBy(xpath = "//a[text()='Nationalities']")
		WebElement nationalities;
		
		@FindBy(xpath = "//a[text()='Corporate Branding']")
		WebElement corporateBranding;
		
		@FindBy(xpath = "//span[text()='Configuration ']")
		WebElement configurationdropdown;
		
		@FindBy(xpath = "//a[text()='Email Configuration']")
		WebElement emailConfiguration;
		
		@FindBy(xpath = "//a[text()='Email Subscriptions']")
		WebElement emailSubscriptions;
		
		@FindBy(xpath = "//a[text()='Localization']")
		WebElement localization;
		
		@FindBy(xpath = "//a[text()='Language Packages']")
		WebElement languagePackages;
		
		@FindBy(xpath = "//a[text()='Modules']")
		WebElement modules;
		
		@FindBy(xpath = "//a[text()='Social Media Authentication']")
		WebElement socialMediaAuthentication;
		
		@FindBy(xpath = "//a[text()='Register OAuth Client']")
		WebElement registeroEuthClient;
		
		@FindBy(xpath = "//a[text()='LDAP Configuration']")
		WebElement ldapConfiguration;
		
		@FindBy(xpath = "//i[@class='oxd-icon bi-question-lg']")
		WebElement questionTag;
		
		@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
		WebElement usernameTextField;
		
		@FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
		WebElement userRole;
		
		@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
		WebElement userRoleAdmin;
		
		@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
		WebElement eSS;
		
		@FindBy(xpath = "//div[@class='oxd-autocomplete-wrapper']")
		WebElement employeeName;
		
		@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
		WebElement status;
		
		@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")
		WebElement resetButton;
		
		@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
		WebElement searchButton;
		
		@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
		WebElement addButton;
		
		
		
	

}
