#3. Definir las clases:
#b) Implementa las clases con sus constructores, datos por defecto y mostrar.
from datetime import datetime
class Persona:
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, sexo):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_nac = fecha_nac
        self.sexo = sexo

    def calcular_edad(self):
        hoy = datetime.now().year
        año_nac = int(self.fecha_nac.split("/")[-1])
        return hoy - año_nac

    def mostrar(self):
        print(f"CI: {self.ci}")
        print(f"Nombre: {self.nombre} {self.apellido}")
        print(f"Celular: {self.celular}")
        print(f"Fecha Nacimiento: {self.fecha_nac}")
        print(f"Sexo: {self.sexo}")
        print(f"Edad: {self.calcular_edad()} años")

class Estudiante(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, sexo, ru, fecha_ingreso, semestre):
        super().__init__(ci, nombre, apellido, celular, fecha_nac, sexo)
        self.ru = ru
        self.fecha_ingreso = fecha_ingreso
        self.semestre = semestre

    def mostrar(self):
        super().mostrar()
        print(f"RU: {self.ru}")
        print(f"Fecha Ingreso: {self.fecha_ingreso}")
        print(f"Semestre: {self.semestre}")
        print("-------------------")

class Docente(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, sexo, nit, profesion, especialidad):
        super().__init__(ci, nombre, apellido, celular, fecha_nac, sexo)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad

    def mostrar(self):
        super().mostrar()
        print(f"NIT: {self.nit}")
        print(f"Profesión: {self.profesion}")
        print(f"Especialidad: {self.especialidad}")
        print("-------------------")

if __name__ == "__main__":
    # b)Datos por defecto
    estudiante1 = Estudiante("123456", "Ana", "Perez", "70000001", "15/05/1995", "Femenino", "RU001", "10/02/2020", 6)
    estudiante2 = Estudiante("654321", "Juan", "Gomez", "70000002", "20/08/2000", "Masculino", "RU002", "05/03/2021", 4)

    docente1 = Docente("987654", "Carlos", "Gomez", "70000003", "12/12/1980", "Masculino", "NIT001", "Ingeniero", "Sistemas")
    docente2 = Docente("456789", "Maria", "Lopez", "70000004", "01/01/1975", "Femenino", "NIT002", "Licenciada", "Educación")

    # Mostrar todos los registros
    print("\nDATOS REGISTRADOS-------------")
    estudiante1.mostrar()
    estudiante2.mostrar()
    docente1.mostrar()
    docente2.mostrar()

    # c)Mostrar los estudiantes mayores de 25 años.
    print("\nEstudiantes mayores de 25 años")
    estudiantes = [estudiante1, estudiante2]
    for est in estudiantes:
        if est.calcular_edad() > 25:
            est.mostrar()

    # d)Mostrar al docente que tiene la profesión de “Ingeniero”, es del sexo masculino y es el mayor de todos.
    print("\nDocente Ingeniero/Masculino/Mayor")
    docentes = [docente1, docente2]
    docente_mayor = None
    max_edad = 0

    for doc in docentes:
        if doc.profesion == "Ingeniero" and doc.sexo == "Masculino":
            edad = doc.calcular_edad()
            if edad > max_edad:
                max_edad = edad
                docente_mayor = doc

    if docente_mayor:
        docente_mayor.mostrar()
    else:
        print("No hay docente que cumpla los requisitos.")

    # e)Mostrar a los estudiantes y docentes que tienen el mismo apellido
    print("\nMismo apellido")
    personas = [estudiante1, estudiante2, docente1, docente2]
    apellidos = {}

    for persona in personas:
        if persona.apellido in apellidos:
            apellidos[persona.apellido].append(persona)
        else:
            apellidos[persona.apellido] = [persona]

    for apellido, lista in apellidos.items():
        if len(lista) > 1:
            print(f"\nApellido: {apellido}")
            for persona in lista:
                persona.mostrar() if isinstance(persona, Estudiante) or isinstance(persona, Docente) else None