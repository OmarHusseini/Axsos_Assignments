from django.db import models
import bcrypt
import re 

class UserManager(models.Manager):
    def validate_registration(self, postData):
        errors = {}
        if len(postData['firstname']) < 2 or not postData['firstname'].isalpha():
            errors['first_name'] = "First name must be at least 2 letters and contain only letters"
        if len(postData['lastname']) < 2 or not postData['lastname'].isalpha():
            errors['last_name'] = "Last name must be at least 2 letters and contain only letters"
        EMAIL_REGEX = re.compile(r'^[\w\.-]+@[\w\.-]+\.\w+$')
        if not EMAIL_REGEX.match(postData['email']):
            errors['email'] = "Invalid email format"
        if self.filter(email=postData['email']).exists():
            errors['email_taken'] = "Email is already in use"
        if len(postData['password']) < 8:
            errors['password'] = "Password must be at least 8 characters"
        if postData['password'] != postData['confirm_pass']:
            errors['confirm'] = "Passwords do not match"
        return errors
    
class User(models.Model):
    first_name=models.CharField(max_length=20)
    last_name=models.CharField(max_length=20)
    email=models.CharField(max_length=200)
    password=models.CharField(max_length=255)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects = UserManager()


def create_user(post):
    pw_hash = bcrypt.hashpw(post['password'].encode(), bcrypt.gensalt()).decode() 
    user = User.objects.create(first_name=post['firstname'],last_name=post['lastname'],email=post['email'] ,password=pw_hash)
   
    return user  

def show_user(post):
    user=User.objects.filter(email=post['email']).first()
    if not user:
        return None
    if bcrypt.checkpw(post['password'].encode(),user.password.encode()):
        return user 
    