#5.Se hace referencia a algunos de los diferentes ambientes 
#de la Universidad mediante las siguientes clases:
class Oficina:
    def __init__(self, sillas, escritorios, estanterias):
        self.nroSillas = sillas
        self.nroEscritorios = escritorios
        self.nroEstanterias = estanterias

    # Método para mostrar datos de la oficina
    def mostrar(self):
        print("Sillas:", self.nroSillas)
        print("Escritorios:", self.nroEscritorios)
        print("Estanterías:", self.nroEstanterias)

    # Sobrecarga del método cantidadMuebles
    def cantidad_muebles(self, sillas=None, escritorios=None, estanterias=None):
        if sillas is not None and escritorios is not None and estanterias is not None:
            return sillas + escritorios + estanterias
        return self.nroSillas + self.nroEscritorios + self.nroEstanterias


class Aula:
    def __init__(self, nombre, capacidad, pupitres):
        self.nombre = nombre
        self.capacidad = capacidad
        self.nroPupitres = pupitres

    # Método para mostrar datos del aula
    def mostrar(self):
        print("Aula:", self.nombre)
        print("Capacidad:", self.capacidad)
        print("Pupitres:", self.nroPupitres)

    # Sobrecarga del método cantidadMuebles
    def cantidad_muebles(self, pupitres=None):
        if pupitres is not None:
            return pupitres
        return self.nroPupitres


class Laboratorio:
    def __init__(self, nombre, capacidad, mesas, sillas):
        self.nombre = nombre
        self.capacidad = capacidad
        self.nroMesas = mesas
        self.nroSillas = sillas

    # Método para mostrar datos del laboratorio
    def mostrar(self):
        print("Laboratorio:", self.nombre)
        print("Capacidad:", self.capacidad)
        print("Mesas:", self.nroMesas)
        print("Sillas:", self.nroSillas)

    # Sobrecarga del método cantidadMuebles
    def cantidad_muebles(self, mesas=None, sillas=None):
        if mesas is not None and sillas is not None:
            return mesas + sillas
        return self.nroMesas + self.nroSillas


if __name__ == "__main__":
    # Instanciar 2 objetos Oficina, 2 Aulas y 1 Laboratorio
    ofi1 = Oficina(8, 4, 4)
    ofi2 = Oficina(10, 5, 3)

    aula1 = Aula("401", 20, 20)
    aula2 = Aula("502", 20, 20)

    lab = Laboratorio("ESTADISTICA", 15, 10, 16)

    print("-----OFICINAS------")
    print("La Oficina tiene:", ofi1.cantidad_muebles(6, 8, 3))
    print("--------------------------------")
    ofi2.mostrar()
    print("Total de los muebles:", ofi2.cantidad_muebles())
    print("--------------------------------")
    print("------AULAS------")
    aula1.mostrar()