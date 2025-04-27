from django.db import models
   
class ShowManager(models.Manager):
    def basic_validator(self, postData):
        errors = {}
       
        if len(postData['title']) < 3:
            errors["title"] = "title should be at least 2 characters"
        if len(postData['network']) < 3:
            errors["network"] = "network should be at least 3 characters"
        if len(postData['des']) < 10:
            errors["description"] = "description should be at least 10 characters"

        return errors

class Shows(models.Model):
    title = models.CharField(max_length=20)
    network=models.CharField(max_length=8)
    release_date = models.DateTimeField() 
    description=models.CharField(max_length=200) 
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects = ShowManager()

    

def all_show():
    return Shows.objects.all()

def add_new(post):
    show = Shows.objects.create(title=post['title'], network=post['network'],release_date=post['date'],description=post['des'])
    show_id = show.id
    return show_id
def get_show_id(tv_id):
    return Shows.objects.get(id=tv_id)

def update_page(post,tv_id):
    show_update = Shows.objects.get(id=tv_id)
    show_update.title=post['title']
    show_update.network=post['network']
    show_update.release_date=post['date']
    show_update.description=post['des']
    show_update.save()

def delete_show(tv_id):
    show = Shows.objects.get(id=tv_id)
    show.delete()

    
