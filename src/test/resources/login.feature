Feature: Login to WP.pl Application

Background:
Given User is on Login page "https://www.wp.pl/"

@InvalidCredentials
Scenario: Login with valid credentials

When User open Login Site and enters username as "admin@wp.pl" and password as "admin123"
Then User see error message "Nieprawidłowy adres e‑mail lub hasło" under password lable
