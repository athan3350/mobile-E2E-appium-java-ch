@runAll
Feature: Enter to the EU cope web page

  ** As a ** EU cope user
  ** I want to ** Enter to the web page
  ** So that I can *** search about Pharmaceutical Entrepreneurs

  @EUSuccess
  Scenario Outline: Validate we can access to the EU web page
    Given <clientName> is an user
    When Want to access to the EU web page
    Then we want to validate that I can access to the correct page

    Examples:
      | clientName |
      | Sebastian  |

