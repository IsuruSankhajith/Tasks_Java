import tkinter

class GuiProgramm:
    def __init__(self):
        self.main=tkinter.TK()
        self.main.title('Example')
      
        self.resizable(width=False,height=False)

        self.image = tkinter.photoImage(File='1200px-Edith_Cowan_University_Logo_-_vector.svg')
        self.imgLabel = tkinter.Label(self.main,image=self.image)
        self.imgLabel.pack()

        self.button = tkinter.Button(self.main,text='Example',command=self.Example)
        self.button.pack(fill='x')

        tkinter.mainloop()

    def Example(self)
        if self.image.ceget('file') == '1200px-Edith_Cowan_University_Logo_-_vector.svg'
            self.image.cofigure(file='1200px-Edith_Cowan_University_Logo_-_vector.svg')

        else:
            self.image.cofigure(file='1200px-Edith_Cowan_University_Logo_-_vector.svg')

gui=GuiProgramm() #object creat
