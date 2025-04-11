#9.Para los bloques del juego Minecraft se usará los siguientes objetos:
class Bloque:
    def colocar(self, orientacion):
        print(f"Bloque colocado en la orientación: {orientacion}")
class BloqueCofre(Bloque):
    def _init_(self, capacidad, resistencia, tipo):
        self.capacidad = capacidad
        self.resistencia = resistencia
        self.tipo = tipo
    def accionar(self):
        print(f"Se abre el cofre de tipo '{self.tipo}' de capacidad {self.capacidad} y resistencia {self.resistencia}.")
    def romper(self):
        print(f"¡Cofre '{self.tipo}' roto! Podrías perder los objetos almacenados.")
class BloqueTnt(Bloque):
    def _init_(self, tipo, danio):
        self.tipo = tipo
        self.danio = danio
    def accionar(self):
        print(f"¡TNT '{self.tipo}' encendida! ¡Aléjate!")
    def romper(self):
        print(f"¡BOOM! La TNT '{self.tipo}' explotó causando {self.danio} de daño.")
class BloqueHorno(Bloque):
    def _init_(self, color, capacidadComida):
        self.color = color
        self.capacidadComida = capacidadComida
    def accionar(self):
        print(f"Horno de color {self.color} encendido. Cocinando {self.capacidadComida} unidades de comida.")
    def romper(self):
        print(f"¡Horno {self.color} destruido! Se perdió la comida.")
        print("------------------------------------------")
bloques = [
    BloqueCofre(100, 50, "Madera"),
    BloqueCofre(200, 70, "Hierro"),
    BloqueTnt("Explosiva", 300),
    BloqueTnt("Mega", 500),
    BloqueHorno("Rojo", 10),
    BloqueHorno("Negro", 20)
]
for bloque in bloques:
    print("----------------")
    bloque.colocar("en el suelo")
    bloque.accionar()
    bloque.romper()
class BloqueCofre:
    def _init_(self, capacidad, resistencia, tipo):
        self.capacidad = capacidad
        self.resistencia = resistencia
        self.tipo = tipo

    def accion(self):
        return f"Este es un bloque de cofre de tipo {self.tipo} con capacidad de {self.capacidad}."

    def colocar(self, orientacion):
        return f"Colocado el bloque de cofre en {orientacion}."

    def romper(self):
        return f"Rompiendo el bloque de cofre, resistencia actual: {self.resistencia}."


class BloqueTnt:
    def _init_(self, tipo, dano):
        self.tipo = tipo
        self.dano = dano

    def accion(self):
        return f"Este es un bloque TNT de tipo {self.tipo} con daño {self.dano}."

    def colocar(self, orientacion):
        return f"Colocado el bloque TNT en {orientacion}."

    def romper(self):
        return f"Rompiendo el bloque TNT, daño potencial: {self.dano}."


class BloqueHorno:
    def _init_(self, color, capacidadComida):
        self.color = color
        self.capacidadComida = capacidadComida

    def accion(self):
        return f"Este es un bloque horno de color {self.color} con capacidad de comida {self.capacidadComida}."

    def colocar(self, orientacion):
        return f"Colocado el bloque horno en {orientacion}."

    def romper(self):
        return "Rompiendo el bloque horno, podría liberar comida."

bloque_cofre1 = BloqueCofre(capacidad=100, resistencia=50, tipo="Madera")
bloque_cofre2 = BloqueCofre(capacidad=200, resistencia=100, tipo="Hierro")

bloque_tnt1 = BloqueTnt(tipo="Explosivo", dano=70)
bloque_tnt2 = BloqueTnt(tipo="SuperExplosivo", dano=120)

bloque_horno1 = BloqueHorno(color="Gris", capacidadComida=50)
bloque_horno2 = BloqueHorno(color="Negro", capacidadComida=75)
print("------------------------------------------")
#b)Sobrescribe accion() en BloqueCofre, BloqueTnt y BloqueHorno, 
# mostrando distintos mensajes según el tipo de bloque.
print(bloque_cofre1.accion())
print(bloque_cofre2.accion())
print(bloque_tnt1.accion())
print(bloque_tnt2.accion())
print(bloque_horno1.accion())
print(bloque_horno2.accion())
print("------------------------------------------")
#c)Sobrecarga colocar() para permitir colocar un bloque en diferentes 
# orientaciones (por ejemplo, en el suelo o en la pared).
print(bloque_cofre1.colocar("suelo"))
print(bloque_tnt2.colocar("pared"))
print(bloque_horno1.colocar("suelo"))
print("------------------------------------------")
#d)Sobrescribe romper() en BloqueCofre, BloqueTnt y BloqueHorno, 
# mostrando distintos mensajes según el tipo de bloque y que puede suceder al romperlos.
print(bloque_cofre1.romper())
print(bloque_tnt1.romper())
print(bloque_horno2.romper())