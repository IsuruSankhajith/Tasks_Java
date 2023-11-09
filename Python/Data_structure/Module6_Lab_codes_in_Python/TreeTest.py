"""code from Pearson Education, Inc p104 """
    
class BST:
    def __init__(self):
        self.root = None
        self.size = 0

    # Return True if the element is in the tree
    def search(self, e):
        current = self.root # Start from the root

        while current != None:
            if e < current.element:
                current = current.left
            elif e > current.element:
                current = current.right
            else: # element matches current.element
                return True # Element is found

        return False

    # Insert element e into the binary search tree
    # Return True if the element is inserted successfully
    def insert(self, e):
        if self.root == None:
          self.root = self.createNewNode(e) # Create a new root
        else:
          # Locate the parent node
          parent = None
          current = self.root
          while current != None:
            if e < current.element:
              parent = current
              current = current.left
            elif e > current.element:
              parent = current
              current = current.right
            else:
              return False # Duplicate node not inserted

          # Create the new node and attach it to the parent node
          if e < parent.element:
            parent.left = self.createNewNode(e)
          else:
            parent.right = self.createNewNode(e)

        self.size += 1 # Increase tree size
        return True # Element inserted

    # Create a new TreeNode for element e
    def createNewNode(self, e):
      return TreeNode(e)

    # Inorder traversal from the root
    def inorder(self):
      self.inorderHelper(self.root)

    # Inorder traversal from a subtree
    def inorderHelper(self, r):
      if r != None:
        self.inorderHelper(r.left)
        print(r.element, end = " ")
        self.inorderHelper(r.right)

    # Postorder traversal from the root
    def postorder(self):
      self.postorderHelper(self.root)

    # Postorder traversal from a subtree
    def postorderHelper(self, root):
      if root != None:
        self.postorderHelper(root.left)
        self.postorderHelper(root.right)
        print(root.element, end = " ")

    # Preorder traversal from the root
    def preorder(self):
      self.preorderHelper(self.root)

    # Preorder traversal from a subtree
    def preorderHelper(self, root):
      if root != None:
        print(root.element, end = " ")
        self.preorderHelper(root.left)
        self.preorderHelper(root.right)

    
    # Return true if the tree is empty
    def isEmpty(self):
      return self.size == 0

    # Remove all elements from the tree
    def clear(self):
      self.root == None
      self.size == 0

    # Return the root of the tree
    def getRoot(self):
      return self.root

class TreeNode:
    def __init__(self, e):
      self.element = e
      self.left = None # Point to the left node, default None
      self.right = None # Point to the right node, default None

    ####################### Main test binary tree

def main(size = 7):

    print ("\n\n (1) Inserting the following string keys into an empty BST:\n")
    print ("\tGeorge, Michael, Tom, Adam, Jones, Peter, Daniel\n")
    
    tree = BST()
    tree.insert("George")
    tree.insert("Michael")
    tree.insert("Tom")
    tree.insert("Adam")
    tree.insert("Jones")
    tree.insert("Peter")
    tree.insert("Daniel")


    # Traverse tree
    print("\tInorder (sorted): ", end = "")
    tree.inorder()
    print("\n\tPostorder:        ", end = "")
    tree.postorder()
    print("\n\tPreorder:         ", end = "")
    tree.preorder()
    
      
    numbers =[49, 76, 67, 29, 75, 18, 4, 83, 87, 40]
    print ("\n\n\n (2) Inserting the following integer keys into an initially empty BST:", end="\n     ")
    for i in numbers:
        print(i, end=" ")
    print()   
    intTree = BST()
    for e in numbers:
      intTree.insert(e)

    print("\n\tPreorder traversal sequence:", end="\n\t  ")
    intTree.preorder()
    print("\n\n\tInorder traversal sequence:", end="\n\t  ")
    intTree.inorder()
    print("\n\n\tPostorder traversal sequence:", end="\n\t ")
    intTree.postorder()


      
if __name__ == "__main__":
    main() 
