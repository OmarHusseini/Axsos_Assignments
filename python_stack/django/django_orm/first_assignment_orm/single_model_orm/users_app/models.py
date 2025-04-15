from django.db import models

class User(models.Model):
    first_name=models.CharField(max_length=30)
    last_name=models.CharField(max_length=30)
    email_address=models.CharField(max_length=30)
    age=models.IntegerField()
    created_at= models.DateTimeField(auto_now_add=True)
    updated_at=models.DateTimeField(auto_now=True)


def new_user(post):
    User.objects.create(first_name=post['first_name'],last_name=post['last_name'],email_address=post['email'],age=post['age'])

def all_user():
    return User.objects.all()