#Crea un clase Celular con espacios para 20 aplicaciones
#o 1024MB de espacio

class Celular:
    def __init__(self):
        self.aplicaciones = [None] * 20  # lista de aplicaciones
        self.espacio_disponible = 1024  # en MB
        self.bateria = 100  # en porcentaje
        self.cantidad_aplicaciones = 0

    def instalar_nueva_aplicacion(self, nombre, tamano):
        if self.cantidad_aplicaciones < 20 and self.espacio_disponible >= tamano:
            self.aplicaciones[self.cantidad_aplicaciones] = nombre
            self.cantidad_aplicaciones += 1
            self.espacio_disponible -= tamano
            print(f"Aplicación {nombre} se instaló con éxito.")
            return True
        else:
            print("Aplicación no instalada. Falta espacio.")
            return False

    def utilizar_aplicacion(self, minutos_uso, tamano_aplicacion):
        if self.bateria <= 0:
            print("Celular apagado.")
            return

        if tamano_aplicacion > 250:
            porcentaje_bateria = 5
        elif tamano_aplicacion > 100:
            porcentaje_bateria = 2
        else:
            porcentaje_bateria = 1

        bloques_de_10_minutos = minutos_uso // 10
        consumo_total = porcentaje_bateria * bloques_de_10_minutos

        self.bateria -= consumo_total
        if self.bateria < 0:
            self.bateria = 0

        print(f"Se usó la aplicación durante {minutos_uso} minutos.")
    
    def mostrar_porcentaje_bateria_restante(self):
        print(f"Batería restante: {self.bateria}%")

if __name__ == "__main__":
    celular = Celular()

    print("------APLICACIONES---------")
    celular.instalar_nueva_aplicacion("Tik Tok", 900)
    celular.instalar_nueva_aplicacion("Instagram", 622)
    celular.instalar_nueva_aplicacion("Canva", 50)

    print("---------------------------------")
    
    print("-----USO Y BATERÍA-----")
    celular.utilizar_aplicacion(30, 100)
    celular.mostrar_porcentaje_bateria_restante()

    celular.utilizar_aplicacion(60, 200)
    celular.mostrar_porcentaje_bateria_restante()

    celular.utilizar_aplicacion(100, 300)
    celular.mostrar_porcentaje_bateria_restante()