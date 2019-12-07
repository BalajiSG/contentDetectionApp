# contentDetectionApp

Andriod App for UI
Firebase Database for storing image and data 
Azure cognitive servcie for content detection


Cognitive Vision API Document

https://centralindia.api.cognitive.microsoft.com/vision/v2.1/analyze?visualFeatures=Categories,Description,Color,Adult

Header 
Ocp-Apim-Subscription-Key : Subscription key

formdata : select image 

Response {
    "categories": [
        {
            "name": "people_many",
            "score": 0.67578125
        }
    ],
    "adult": {
        "isAdultContent": false,
        "isRacyContent": false,
        "isGoryContent": false,
        "adultScore": 0.020490376278758049,
        "racyScore": 0.036222312599420547,
        "goreScore": 0.00050637929234653711
    },
    "color": {
        "dominantColorForeground": "White",
        "dominantColorBackground": "White",
        "dominantColors": [
            "White",
            "Grey"
        ],
        "accentColor": "2377A8",
        "isBwImg": false,
        "isBWImg": false
    },
    "description": {
        "tags": [
            "laptop",
            "person",
            "computer",
            "man",
            "front",
            "looking",
            "woman",
            "holding",
            "sitting",
            "library",
            "screen",
            "standing",
            "table",
            "people",
            "room",
            "shirt"
        ],
        "captions": [
            {
                "text": "a person standing in front of a laptop",
                "confidence": 0.67255244859732688
            }
        ]
    },
    "requestId": "adce0979-8e10-445c-acf8-730e12974a3e",
    "metadata": {
        "width": 166,
        "height": 119,
        "format": "Jpeg"
    }
}

