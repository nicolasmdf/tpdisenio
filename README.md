Consigna:

Trabajo Práctico 
Trabajo Práctico: Diseño de Clases para un Mini Sistema de Gestión de Bar
Objetivo: Diseñar y estructurar las clases de un sistema de software que permita gestionar un bar, integrando conceptos de programación orientada a objetos y buenas prácticas de modelado.
Instrucciones:
Análisis del Sistema:
Identifiquen los elementos esenciales que componen el funcionamiento de un bar. Ejemplos incluyen: Mesas, Clientes, Pedidos, Productos, y Personal (como Mozos ).
Requerimientos del Sistema:
El sistema debe gestionar mesas asignadas a clientes, pedidos realizados, productos disponibles (bebidas, comidas) y el personal encargado de atender.
Permitir que un cliente pueda realizar varios pedidos durante su estadía en el bar.
Calcular el total de la cuenta de cada mesa en base a los pedidos.
Diseño de Clases:
Definan y diseñen las clases principales del sistema:
Clase Mesa: Representa cada mesa del bar, asociada con clientes y su estado (ocupada/libre).
Clase Cliente: Representa a los clientes, quienes pueden realizar pedidos.
Clase Pedido: Incluye los productos solicitados y el total a pagar.
Clase Producto: Cada producto tiene atributos como nombre, precio y tipo (bebida o comida).
Clase Personal: Personal del bar, como mozos, cada uno con su rol.
Relaciones y Métodos:
Especificar la relación entre clases (por ejemplo, una Mesa tiene una lista de Pedidos).
Agregar métodos relevantes en cada clase, como:
agregar_pedido() en la clase Mesa.
calcular_total() en la clase Pedido.
asignar_mesa() en la clase Mozo (subclase de Personal).
