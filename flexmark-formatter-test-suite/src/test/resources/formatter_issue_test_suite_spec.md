---
title: DocxRenderer
author:
version:
date: '2017-12-07'
license: '[CC-BY-SA 4.0](http://creativecommons.org/licenses/by-sa/4.0/)'
...

---

## Formatter

```````````````````````````````` example(Formatter: 1) options(item-indent-1)
Text

1. numbered list one
 - unnumbered list
 unnumbered list cont. same line
 - unnumbered list  
 unnumbered list cont. next line

 numbered list one cont. after unnumbered list
.
Text

1. numbered list one
 - unnumbered list
  unnumbered list cont. same line
 - unnumbered list  
  unnumbered list cont. next line

 numbered list one cont. after unnumbered list

.
Document[0, 180]
  Paragraph[0, 5] isTrailingBlankLine
    Text[0, 4] chars:[0, 4, "Text"]
  BlankLine[5, 6]
  OrderedList[6, 180] isTight delimiter:'.'
    OrderedListItem[6, 180] open:[6, 8, "1."] isTight hadBlankLine
      Paragraph[9, 27]
        Text[9, 26] chars:[9, 26, "numbe … t one"]
      BulletList[28, 133] isTight
        BulletListItem[28, 79] open:[28, 29, "-"] isTight
          Paragraph[30, 79]
            Text[30, 45] chars:[30, 45, "unnum …  list"]
            SoftLineBreak[45, 46]
            Text[47, 78] chars:[47, 78, "unnum …  line"]
        BulletListItem[80, 133] open:[80, 81, "-"] isTight hadBlankLineAfter
          Paragraph[82, 133] isTrailingBlankLine
            Text[82, 97] chars:[82, 97, "unnum …  list"]
            HardLineBreak[97, 100]
            Text[101, 132] chars:[101, 132, "unnum …  line"]
      Paragraph[135, 180]
        Text[135, 180] chars:[135, 180, "numbe …  list"]
````````````````````````````````


## Append References

Without append just include

```````````````````````````````` example(Append References: 1) options(no-append-references)
Text with footnote[^footnote] abbr, link ref [ref], image ref ![image], []

Enumerated Ref{#enum:this}

See [@enum:this]

.
Text with footnote[^footnote] abbr, link ref [ref], image ref ![image], []

Enumerated Ref{#enum:this}

See [@enum:this]

.
Document[0, 122]
  Paragraph[0, 75] isTrailingBlankLine
    Text[0, 18] chars:[0, 18, "Text  … tnote"]
    Footnote[18, 29] ordinal: 0  textOpen:[18, 20, "[^"] text:[20, 28, "footnote"] textClose:[28, 29, "]"]
      Text[20, 28] chars:[20, 28, "footnote"]
    TextBase[29, 45] chars:[29, 45, " abbr …  ref "]
      Text[29, 30] chars:[29, 30, " "]
      Abbreviation[30, 34] chars:[30, 34, "abbr"]
      Text[34, 45] chars:[34, 45, ", lin …  ref "]
    LinkRef[45, 50] referenceOpen:[45, 46, "["] reference:[46, 49, "ref"] referenceClose:[49, 50, "]"]
      Text[46, 49] chars:[46, 49, "ref"]
    Text[50, 62] chars:[50, 62, ", ima …  ref "]
    ImageRef[62, 70] referenceOpen:[62, 64, "!["] reference:[64, 69, "image"] referenceClose:[69, 70, "]"]
      Text[64, 69] chars:[64, 69, "image"]
    Text[70, 72] chars:[70, 72, ", "]
    LinkRef[72, 74] referenceOpen:[72, 73, "["] reference:[73, 73] referenceClose:[73, 74, "]"]
  BlankLine[75, 76]
  Paragraph[76, 103] isTrailingBlankLine
    TextBase[76, 90] chars:[76, 90, "Enume … d Ref"]
      Text[76, 90] chars:[76, 90, "Enume … d Ref"]
    AttributesNode[90, 102] textOpen:[90, 91, "{"] text:[91, 101, "#enum:this"] textClose:[101, 102, "}"]
      AttributeNode[91, 101] name:[91, 92, "#"] value:[92, 101, "enum:this"] isImplicit isId
  BlankLine[103, 104]
  Paragraph[104, 121] isTrailingBlankLine
    Text[104, 108] chars:[104, 108, "See "]
    EnumeratedReferenceLink[108, 120] textOpen:[108, 110, "[@"] text:[110, 119, "enum:this"] textClose:[119, 120, "]"]
      Text[110, 119] chars:[110, 119, "enum:this"]
  BlankLine[121, 122]
````````````````````````````````


With append just include

```````````````````````````````` example(Append References: 2) options(append-references)
Text with footnote[^footnote] abbr, link ref [ref], image ref ![image], <<<macro1>>>

Enumerated Ref{#enum:this}

See [@enum:this]
 
.
Text with footnote[^footnote] abbr, link ref [ref], image ref ![image], <<<macro1>>>

Enumerated Ref{#enum:this}

See [@enum:this]

*[abbr]: Abbreviation

[@enum]: Enumerated Reference [#]

[^footnote]: Included footnote
    with some extras

>>>macro1
macro text
<<<

[ref]: ./link.md
[image]: ./included.png

.
Document[0, 133]
  Paragraph[0, 85] isTrailingBlankLine
    Text[0, 18] chars:[0, 18, "Text  … tnote"]
    Footnote[18, 29] ordinal: 0  textOpen:[18, 20, "[^"] text:[20, 28, "footnote"] textClose:[28, 29, "]"]
      Text[20, 28] chars:[20, 28, "footnote"]
    TextBase[29, 45] chars:[29, 45, " abbr …  ref "]
      Text[29, 30] chars:[29, 30, " "]
      Abbreviation[30, 34] chars:[30, 34, "abbr"]
      Text[34, 45] chars:[34, 45, ", lin …  ref "]
    LinkRef[45, 50] referenceOpen:[45, 46, "["] reference:[46, 49, "ref"] referenceClose:[49, 50, "]"]
      Text[46, 49] chars:[46, 49, "ref"]
    Text[50, 62] chars:[50, 62, ", ima …  ref "]
    ImageRef[62, 70] referenceOpen:[62, 64, "!["] reference:[64, 69, "image"] referenceClose:[69, 70, "]"]
      Text[64, 69] chars:[64, 69, "image"]
    Text[70, 72] chars:[70, 72, ", "]
    MacroReference[72, 84] textOpen:[72, 75, "<<<"] text:[75, 81, "macro1"] textClose:[81, 84, ">>>"]
  BlankLine[85, 86]
  Paragraph[86, 113] isTrailingBlankLine
    TextBase[86, 100] chars:[86, 100, "Enume … d Ref"]
      Text[86, 100] chars:[86, 100, "Enume … d Ref"]
    AttributesNode[100, 112] textOpen:[100, 101, "{"] text:[101, 111, "#enum:this"] textClose:[111, 112, "}"]
      AttributeNode[101, 111] name:[101, 102, "#"] value:[102, 111, "enum:this"] isImplicit isId
  BlankLine[113, 114]
  Paragraph[114, 131] isTrailingBlankLine
    Text[114, 118] chars:[114, 118, "See "]
    EnumeratedReferenceLink[118, 130] textOpen:[118, 120, "[@"] text:[120, 129, "enum:this"] textClose:[129, 130, "]"]
      Text[120, 129] chars:[120, 129, "enum:this"]
  BlankLine[131, 133]
````````````````````````````````

