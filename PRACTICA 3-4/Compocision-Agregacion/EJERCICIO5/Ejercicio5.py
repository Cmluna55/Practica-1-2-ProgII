#5. Desarrolla un POO para un equipo de fútbol y sus jugadores. El equipo está
#compuesto por jugadores, y si el equipo se destruye, los jugadores también se
#destruyen. Además, los jugadores pueden ser de diferentes tipos (portero,
#defensa, mediocampista, delantero).
#a) Implementa las clases con sus constructores, getters y setters.
class Jugador:
    def __init__(self, nombre, numero, posicion):
        self.nombre = nombre
        self.numero = numero
        self.posicion = posicion

    def mostrar_info(self):
        print(f"**Jugador: {self.nombre}")
        print(f"Número: {self.numero}")
        print(f"Posición: {self.posicion}")

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_numero(self):
        return self.numero

    def set_numero(self, numero):
        self.numero = numero

class Portero(Jugador):
    def __init__(self, nombre, numero):
        super().__init__(nombre, numero, "Portero")
        self.habilidad_especial = "Atajadas"

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Habilidad: {self.habilidad_especial}")


class Defensa(Jugador):
    def __init__(self, nombre, numero):
        super().__init__(nombre, numero, "Defensa")
        self.habilidad_especial = "Marcaje"

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Habilidad: {self.habilidad_especial}")


class Mediocampista(Jugador):
    def __init__(self, nombre, numero):
        super().__init__(nombre, numero, "Mediocampista")
        self.habilidad_especial = "Pases"

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Habilidad: {self.habilidad_especial}")


class Delantero(Jugador):
    def __init__(self, nombre, numero):
        super().__init__(nombre, numero, "Delantero")
        self.habilidad_especial = "Goles"

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Habilidad: {self.habilidad_especial}")       

class Equipo:
    def __init__(self, nombre):
        self.nombre = nombre
        self.jugadores = [] 

    def agregar_jugador(self, jugador):
        self.jugadores.append(jugador)
        print(f"Se agregó a {jugador.nombre} al equipo {self.nombre}")

    def mostrar_equipo(self):
        print(f"\n**EQUIPO: {self.nombre}")
        print("Jugadores:")
        for jugador in self.jugadores:
            jugador.mostrar_info()


    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

if __name__ == "__main__":
    # b)Crea un equipo y agrega varios jugadores de diferentes tipos.
    barcelona = Equipo("FC Barcelona")

    #tipos
    ter_Stegen = Portero("Ter Stegen", 1)
    pique = Defensa("Piqué", 3)
    pedri = Mediocampista("Pedri", 8)
    lewandowski = Delantero("Lewandowski", 9)

    #jugadores
    barcelona.agregar_jugador(ter_Stegen)
    barcelona.agregar_jugador(pique)
    barcelona.agregar_jugador(pedri)
    barcelona.agregar_jugador(lewandowski)

    # c)Muestra la información del equipo y sus jugadores
    barcelona.mostrar_equipo()

    # Ejemplo de composición: Si el equipo se disuelve, los jugadores también
    print("\n¡El equipo se disolvió! Todos los jugadores fueron liberados.")
    del barcelona  # Los jugadores ya no existen