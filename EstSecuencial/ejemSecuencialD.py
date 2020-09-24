def CalcularPromedioNota():
    #Datos de Entrada
    N1 = int(input('Ingrese Nota 1: '))
    N2 = int(input('Ingrese Nota 2: '))
    N3 = int(input('Ingrese Nota 3: '))
    N4 = int(input('Ingrese Nota 4: '))
    #Proceso
    PC = (N1+N2+N3+N4)/4
    #Dato de salida
    print(f'El promedio de la calificacion es: {PC}')

def CalcularElPintado():
     #Datos de Entrada
    cantidadM2= int(input('Ingrese la cantidad m2 a pintar: '))
    costoM2 = int(input('Costo por m2 : '))
    #Proceso
    montoC = cantidadM2 * costoM2
    #Dato de salida
    print(f'Monto a cobrar es : {montoC}')


def decision():
    print('Hola Bienvenido')
    print()
    print("""
    Menu: Seleccione una opcion
    1. Calcular el promedio de tus notas
    2. Calcular el servicio de pintado
    3. salir
    """)
    menu = int(input())
    
    if menu == 1:
        CalcularPromedioNota()
    elif menu == 2:
        CalcularElPintado()
    elif menu == 3:
        print('Chau hasta pronto')
    else:
        print('Ingrese una opcion correcta.')
        decision()

decision()