from elasticsearch import Elasticsearch
es = Elasticsearch(['https://search-bw101215a-oxk5vxxxxxx2xxxaa.eu-west-1.es.amazonaws.com'])  # use default of localhost, port 9200
es.index(index='posts', doc_type='blog', id=3, body={
    'author': 'Benjamin Pollack',
    'blog': 'bitquabit',
    'title': 'How to Write Clickbait Titles About Git Being Awful Compared to Mercurial',
    'topics': ['mercurial', 'git', 'flamewars', 'hidden messages'],
    'awesomeness': 0.95
})
