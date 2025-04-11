#1.Sea la clase VideoJuego
class VideoJuego:
    def __init__(self, nombre, plataforma, cantidad_jugadores=2):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidad_jugadores = cantidad_jugadores

    def mostrar(self):
        print(f"Nombre: {self.nombre}\nPlataforma: {self.plataforma}\nJugadores: {self.cantidad_jugadores}")

    def agregar_jugadores(self, cantidad=1):
        self.cantidad_jugadores += cantidad

if __name__ == "__main__":
    vj1 = VideoJuego("Mortal Kombat", "Play Station")
    vj1.mostrar()
    vj1.agregar_jugadores()
    vj1.mostrar()
    print("---------------------------------------------")
    vj2 = VideoJuego("Tekken", "Play Station", 4)
    vj2.mostrar()
    vj2.agregar_jugadores(2)
    vj2.mostrar()