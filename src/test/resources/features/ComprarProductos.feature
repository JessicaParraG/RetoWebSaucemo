#language: es

Característica: Comprar productos

  @CompraExitosa
  Esquema del escenario: Agregar productos al carrito y realizar compra
    Dado que el usuario ingresa a la pagina <url>
    Cuando el ingrese las credenciales <usuario> <clave>
    Y el seleccione los productos que desea comprar <accion>
    Entonces el validara un mensaje de compra exitosa

    Ejemplos:
      | url                        | usuario       | clave        | accion          |
      | https://www.saucedemo.com/ | standard_user | secret_sauce | Compra completa |

  @LoginFallido
  Esquema del escenario: Login con usuario errado
    Dado que el usuario ingresa a la pagina <url>
    Cuando el ingrese las credenciales <usuario> <clave>
    Entonces el visualizara un mensaje de error

    Ejemplos:
      | url                        | usuario       | clave        |
      | https://www.saucedemo.com/ | standard_user | 10515610520  |
      | https://www.saucedemo.com/ | prueba        | secret_sauce |

  @CompraIncompleta
  Esquema del escenario: Compra incompleta
    Dado que el usuario ingresa a la pagina <url>
    Cuando el ingrese las credenciales <usuario> <clave>
    Y el seleccione los productos que desea comprar <accion>
    Entonces visualizara un mensaje de informacion obligatoria

    Ejemplos:
      | url                        | usuario       | clave        | accion            |
      | https://www.saucedemo.com/ | standard_user | secret_sauce | Compra incompleta |
