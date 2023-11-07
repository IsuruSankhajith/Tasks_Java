"""
File: unitList.py

Tests unit-list class.
"""

"""
  It is to demonstrate how to build an SLL, which in this example represents a list of semester 
  results of a unit. Each SLL node contains a record of one student's results of the semester, 
  that is, it stores a student ID followed by marks of three assessment components 
  (A1_result, A2_result, and exam_result). For simplicity, all marks are integers. It also 
  shows the technique of traversing an SLL, searching an SLL and inserting a node into the SLL. 
  Hope this helps understanding of the linked list data structure and concepts and operations, etc.. 

  (Code tested in Python 3.4 IDLE)
  
  for simplicity, SLL store student information in ascending order on Student_ID, which is st_data[0]
  @author jitian XIAO 
  @version v1

"""
class UnitMark:                          # student unit-mark node
    
    def __init__(self, marks, next = None):    # st_marks: a list storing (ID, A1_result, A2_result, exam_result)
        self.length=len(marks)-1
        self.rep=self.__str(marks)
        self.marks = marks
        self.next = next
        
    def __str(self, marks):
        terms = ["(ID: "+str(marks[0])+ \
                 ", A1: "+str(marks[1])+ \
                 ", A2: "+str(marks[2]) + \
                ", exam: "+str(marks[3])]
        return str(terms)
    def __eq__(self, that):
        """Returns True if self's id equals otherMarks'S id, or false otherwise"""
        return self.marks[0] == that[0]
        
   

    """ -----------------------------Print Highest result  """
    def highest_result(self):
        #serach student with hishest mark - (or traversal)
        if self is not None:                             #at least one node       
            curr = self
            curr_marks = self.marks
            curr_ID = curr_marks[0]
            highest_mark = curr_marks[1]+ curr_marks[2]+curr_marks[3]

            if curr.next is not None:                       #list with at least 2 nodes
                while curr.next is not None:
                    curr = curr.next
                    totalMark=curr.marks[1]+curr.marks[2]+curr.marks[3]
                    if totalMark > highest_mark:
                        curr_ID = curr.marks[0]
                        highest_mark= totalMark
                print("----- Student with the highest mark is: ==> ID: "+ str(curr_ID) +\
                      " (total mark: " + str(highest_mark) +")")
                print()
            else:           # print student Id and highest total mark
                print("Student with the highest mark is: ==> ID: "+ curr_ID +\
                      " (total mark: " + str(highest_mark) +")")
                print()
        else:
            print ("no student record found!")

        
    #------Insert a mark in the sorted SLL, or replace it if the ID exists; return the head
    
    def insert_unit_result(self, st_unit_marks): # st_unit_marks, as a node, stores [ID, mark1, mark2, mark3] + pointer

        new_node =[0]*4
        old_node =[0]*4
        old_node[0]=self.marks[0]
        old_node[1]=self.marks[1]
        old_node[2]=self.marks[2]
        old_node[3]=self.marks[3]
        new_node[0]=st_unit_marks.marks[0]
        new_node[1]=st_unit_marks.marks[1]
        new_node[2]=st_unit_marks.marks[2]
        new_node[3]=st_unit_marks.marks[3]

                
        if self is None:                        #empty list: insert as the only node (i.e, return the list as only node in SLL)
            return st_unit_marks
        else:                                     # list is not None, at least 1 node
            previous = None
            curr = self
            while curr is not None:
                curr_marks = curr.marks
                curr_node_id = curr.marks[0]
                #print("current id:  "+ str(curr_node_id)+" new id: " + str(new_node[0]))
                if curr_node_id < new_node[0]:      # searching for a place to insert
                    previous = curr
                    curr = curr.next
                    #print("-------curr_node_id > new_node[0] - continue...")
                elif curr_node_id == new_node[0]:   #same ID: replace
                    curr.marks = st_unit_marks
                    #print("-------curr_node_id = new_node[0] - same id...")
                    return self
                else:                                     #insert place found (st_unit_marks[0] < curr.marks[0])         
                    #print("-------curr_node_id > new_node[0] - insert here...")
                    st_unit_marks.next =curr
                    if previous is None:
                        return st_unit_marks        # insert as first node
                    else:
                        previous.next = st_unit_marks
                        return self
            if curr is None:                        # reach the end of SLL; insert at the end
                previous.next = st_unit_marks
                return self
        
       
"""  -----print one student record--------   """
def print_one_unit_result(u_list):
    if u_list is None:
        print("No student records")
        return
    else:
        print("Current unit result:")
        lyst = u_list.marks
        total = lyst[1]+lyst[2] +lyst[3]
        print(" Student_ID.: " + str(lyst[0])+"  A1: " + str(lyst[1])+"  A2: "
                  + str(lyst[2])+"  Eaxm: " + str(lyst[3])+" ->total " + str(total)+"\n")

"""  -----print all student marks of the unit--------   """
def print_unit_result(u_list):
    if u_list is None:
        print("No student records")
        return
    else:
        print("Current linked list contains:")
        curr = u_list
        while curr is not None:
            lyst = curr.marks
            total = lyst[1]+lyst[2] +lyst[3]
            print(" Student_ID.: " + str(lyst[0])+"  A1: " + str(lyst[1])+"  A2: "
                  + str(lyst[2])+"  Eaxm: " + str(lyst[3])+" ->total " + str(total))
            curr = curr.next
        print()

def main(size = 7):

    unit_node1 = None
  
    #create SLL    
    unit_node2 = UnitMark([1189, 2, 30, 30], unit_node1)
    unit_node3 = UnitMark([1145, 9,  16, 20], unit_node2)
    unit_node4 = UnitMark([1122, 11, 19, 40], unit_node3)
    unit_node5 = UnitMark([1116, 8,  16, 35], unit_node4)
    
    unit_node6 = UnitMark([1114, 14, 21, 30], unit_node5)
    unit_node7 = UnitMark([1112, 10, 6,  50], unit_node6)
    unit_node8 = UnitMark([1111, 17, 22, 30], unit_node7)


    unit_list_head = unit_node8

    print_unit_result(unit_list_head)

    
    unit_list_head.highest_result()

    lyst = [1325, 17, 20, 20]
    print("Insert a new record: ID: "+ str(lyst[0]) +" A1: "+ str(lyst[1])+  " A2: "+ str(lyst[2]) +" Exam: "+ str(lyst[3])+"\n")
   
    new_unit_node = UnitMark(lyst, None)
    new_unit_list_head = unit_list_head.insert_unit_result(new_unit_node)
    print_unit_result (new_unit_list_head)


if __name__ == "__main__":
    main() 

