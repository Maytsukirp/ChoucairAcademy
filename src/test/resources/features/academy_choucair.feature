#Autor: Maileth Rivero Palacio

  @stories

  Feature: Academy Choucair
    As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course

    @scenario1
    Scenario: Search for a automation course

      Given than brandon wants to learn automation at the academy Choucair
        | strUser | strPassword   |
        | mrivero | Choucair2022* |
      When he search for the course Patrones de Automatización on the choucair academy platform
      Then  he finds the course called resources Patrones de Automatización
