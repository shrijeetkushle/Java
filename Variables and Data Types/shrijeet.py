import random
import time

def generate_star(quality):
    star = f"    .\n  __/|\\__\n (_/ | \\_)\n    `"
    label = f"\n{quality.capitalize()} Star\n"
    return star + label

def twinkle_night_sky(qualities):
    print("\n\n\t\tWelcome to the Starry Night of Admiration\n\n")
    for quality in qualities:
        print(generate_star(quality))
        time.sleep(1)
    print("\n\n")

qualities = []

print("Enter qualities or traits you admire in your crush (type 'done' when finished):")
while True:
    trait = input("Enter a quality or trait: ").strip()
    if trait.lower() == "done":
        break
    qualities.append(trait)

twinkle_night_sky(qualities)
