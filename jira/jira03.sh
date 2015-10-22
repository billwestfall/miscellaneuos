for i in {0..2}; do cat test02.json | jq “.[${i}]” >> ${i}.json; done
