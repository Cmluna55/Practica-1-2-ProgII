#5. Definir las siguientes clases:
#a) Implementa las clases con sus constructores, getters y setters.
class Empleado:
    def __init__(self, nombre, apellido, salario_base, años_antigüedad):
        self.nombre = nombre
        self.apellido = apellido
        self.salario_base = salario_base
        self.años_antigüedad = años_antigüedad

    def calcular_salario(self):
        bono_antigüedad = self.salario_base * (0.05 * self.años_antigüedad)
        return self.salario_base + bono_antigüedad

    def mostrar(self):
        print(f"***Nombre: {self.nombre} {self.apellido}")
        print(f"Salario base: Bs.{self.salario_base}")
        print(f"Años de antigüedad: {self.años_antigüedad}")
        print(f"Salario total: Bs.{self.calcular_salario():.2f}")

class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antigüedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salario_base, años_antigüedad)
        self.departamento = departamento
        self.bono_gerencial = bono_gerencial

    def calcular_salario(self):
        salario_base = super().calcular_salario()
        return salario_base + self.bono_gerencial

    def mostrar(self):
        super().mostrar()
        print(f"Departamento: {self.departamento}")
        print(f"Bono gerencial: Bs.{self.bono_gerencial}")

class Desarrollador(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antigüedad, lenguaje_programación, horas_extras):
        super().__init__(nombre, apellido, salario_base, años_antigüedad)
        self.lenguaje_programación = lenguaje_programación
        self.horas_extras = horas_extras

    def calcular_salario(self):
        salario_base = super().calcular_salario()
        pago_horas_extras = self.horas_extras * 15 
        return salario_base + pago_horas_extras

    def mostrar(self):
        super().mostrar()
        print(f"Lenguaje de programación: {self.lenguaje_programación}")
        print(f"Horas extras: {self.horas_extras}")

if __name__ == "__main__":
    # b)Crea instancias de Gerente y Desarrollador y muestra su salario calculado.
    gerente1 = Gerente("Andres", "Lopez", 5000, 5, "TI", 1200)
    gerente2 = Gerente("Julia", "Herrera", 6000, 10, "Finanzas", 800)

    desarrollador1 = Desarrollador("Kevin", "Luna", 3200, 3, "Python", 8)
    desarrollador2 = Desarrollador("Camila", "Cruz", 3400, 4, "Java", 11)

    #Salarios calculados:
    print("\n---Salarios Calculados:")
    gerente1.mostrar()
    gerente2.mostrar()

    desarrollador1.mostrar()
    desarrollador2.mostrar()

    # c)Muestra todos los gerentes que tienen un bono gerencial mayor a 1000.
    print("\n-----Gerentes con bono gerencial mayor a 1000: ")
    gerentes = [gerente1, gerente2]
    for gerente in gerentes:
        if gerente.bono_gerencial > 1000:
            gerente.mostrar()

    # d)Muestra todos los desarrolladores que trabajan más de 10 horas extras.
    print("\n------Desarrolladores que trabajan más de 10 horas extras:")
    desarrolladores = [desarrollador1, desarrollador2]
    for dev in desarrolladores:
        if dev.horas_extras > 10:
            dev.mostrar()