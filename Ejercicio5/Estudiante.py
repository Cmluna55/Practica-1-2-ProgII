#5.Crea una clase Estudiante con nombre, nota_1,nota_2
class Estudiante:
    def __init__(self, nombre, nota_1, nota_2):
        self.nombre = nombre
        self.nota_1 = nota_1
        self.nota_2 = nota_2

    def calcular_promedio(self):
        return (self.nota_1 + self.nota_2) / 2

    def verificar_aprobo(self):
        if self.calcular_promedio() >= 6:
            print(f"EL ESTUDIANTE {self.nombre} APROBO")
        else:
            print(f"EL ESTUDIANTE {self.nombre} REPROBO")

    def mostrar(self):
        print(f"Nombre: {self.nombre} nota_1: {self.nota_1} nota_2: {self.nota_2}")

if __name__ == "__main__":
    estudiante1 = Estudiante("Carlos Gutierrez", 6, 6)
    estudiante2 = Estudiante("Carolina Mamani", 7, 8)
    estudiante3 = Estudiante("Pedro Calle", 2, 8)

    estudiante1.mostrar()
    estudiante2.mostrar()
    estudiante3.mostrar()

    print("-----NOTAS--------")
    print(f"{estudiante1.nombre} : Promedio: {estudiante1.calcular_promedio()}")
    estudiante1.verificar_aprobo()
    print(f"{estudiante2.nombre} : Promedio: {estudiante2.calcular_promedio()}")
    estudiante2.verificar_aprobo()
    print(f"{estudiante3.nombre} : Promedio: {estudiante3.calcular_promedio()}")
    estudiante3.verificar_aprobo() 