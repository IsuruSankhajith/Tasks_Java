import tkinter

class GUIProgramm:
    def __init__(self):
        self.main = tkinter.Tk()

        self.main.title('Example')
        self.main.geometry('500x100')
        self.main.resizable(width=False,height=False)
        

        self.main.configure(bg='skyBlue',)

        self.main.attributes('-alpha',2.00)
        self.main.attributes('-topmost', True)

        tkinter.mainloop()

gui = GUIProgramm() #object creat
