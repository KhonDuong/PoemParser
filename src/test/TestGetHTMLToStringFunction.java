package test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import parser.PoemParser;

public class TestGetHTMLToStringFunction {
    /**
     * Test if the GetHTMLToString function properly returns the poem in string format
     */
    @Test

    public void testGHTSF() {
        String poemText = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n" +
                "<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\"><head>\n" +
                "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
                "<meta http-equiv=\"Content-Style-Type\" content=\"text/css\">\n" +
                "<title>The Project Gutenberg eBook of The Raven, by Edgar Allan Poe</title>\n" +
                "\n" +
                "<style type=\"text/css\">\n" +
                "\n" +
                "body { margin-left: 20%;\n" +
                "       margin-right: 20%;\n" +
                "       text-align: justify; }\n" +
                "\n" +
                "h1, h2, h3, h4, h5 {text-align: center; font-style: normal; font-weight:\n" +
                "normal; line-height: 1.5; margin-top: .5em; margin-bottom: .5em;}\n" +
                "\n" +
                "h1 {font-size: 300%;\n" +
                "    margin-top: 0.6em;\n" +
                "    margin-bottom: 0.6em;\n" +
                "    letter-spacing: 0.12em;\n" +
                "    word-spacing: 0.2em;\n" +
                "    text-indent: 0em;}\n" +
                "h2 {font-size: 150%; margin-top: 2em; margin-bottom: 1em;}\n" +
                "h3 {font-size: 130%; margin-top: 1em;}\n" +
                "h4 {font-size: 120%;}\n" +
                "h5 {font-size: 110%;}\n" +
                "\n" +
                ".no-break {page-break-before: avoid;} /* for epubs */\n" +
                "\n" +
                "div.chapter {page-break-before: always; margin-top: 4em;}\n" +
                "\n" +
                "hr {width: 80%; margin-top: 2em; margin-bottom: 2em;}\n" +
                "\n" +
                "p {text-indent: 0em;\n" +
                "   margin-top: 1em;\n" +
                "   margin-bottom: 1em; }\n" +
                "\n" +
                "a:link {color:blue; text-decoration:none}\n" +
                "a:visited {color:blue; text-decoration:none}\n" +
                "a:hover {color:red}\n" +
                "\n" +
                "</style>\n" +
                "\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "\n" +
                "<div style=\"text-align:center; font-size:1.2em; font-weight:bold\">The Project Gutenberg eBook of The Raven, by Edgar Allan Poe</div>\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "This eBook is for the use of anyone anywhere in the United States and\n" +
                "most other parts of the world at no cost and with almost no restrictions\n" +
                "whatsoever. You may copy it, give it away or re-use it under the terms\n" +
                "of the Project Gutenberg License included with this eBook or online\n" +
                "at <a href=\"https://www.gutenberg.org/\">www.gutenberg.org</a>. If you\n" +
                "are not located in the United States, you will have to check the laws of the\n" +
                "country where you are located before using this eBook.\n" +
                "</div>\n" +
                "<div style=\"display:block; margin-top:1em; margin-bottom:1em; margin-left:2em; text-indent:-2em\">Title: The Raven</div>\n" +
                "<div style=\"display:block; margin-top:1em; margin-bottom:1em; margin-left:2em; text-indent:-2em\">Author: Edgar Allan Poe</div>\n" +
                "<div style=\"display:block; margin:1em 0\">Release Date: October 1, 1997 [eBook #1065]<br>\n" +
                "[Most recently updated: October 2, 2021]</div>\n" +
                "<div style=\"display:block; margin:1em 0\">Language: English</div>\n" +
                "<div style=\"display:block; margin:1em 0\">Character set encoding: UTF-8</div>\n" +
                "<div style=\"display:block; margin-left:2em; text-indent:-2em\">Produced by: Levent Kurnaz. HTML version by Al Haines.</div>\n" +
                "<div style=\"margin-top:2em; margin-bottom:4em\">*** START OF THE PROJECT GUTENBERG EBOOK THE RAVEN ***</div>\n" +
                "\n" +
                "<table summary=\"\" style=\"margin-right: auto; margin-left: auto\" cellpadding=\"4\" border=\"3\">\n" +
                "<tbody><tr>\n" +
                "<td>\n" +
                "THIS EBOOK WAS ONE OF PROJECT GUTENBERG’S EARLY FILES. THERE IS\n" +
                "AN IMPROVED ILLUSTRATED EDITION OF THIS TITLE WHICH MAY VIEWED AT EBOOK <big><b><a href=\"https://www.gutenberg.org/files/45484/45484-h/45484-h.htm\">\n" +
                "[ #45484 ]</a></b></big>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody></table>\n" +
                "\n" +
                "<h1>The Raven</h1>\n" +
                "\n" +
                "<h2 class=\"no-break\">by Edgar Allan Poe</h2>\n" +
                "\n" +
                "<div class=\"chapter\">\n" +
                "\n" +
                "<p>\n" +
                "Once upon a midnight dreary, while I pondered, weak and weary,<br>\n" +
                "Over many a quaint and curious volume of forgotten lore—<br>\n" +
                "While I nodded, nearly napping, suddenly there came a tapping,<br>\n" +
                "As of some one gently rapping, rapping at my chamber door.<br>\n" +
                "“’Tis some visiter,” I muttered, “tapping at my chamber door—<br>\n" +
                "<span style=\"margin-left: 20%\">Only this and nothing more.”</span>\n" +
                "</p>\n" +
                "\n" +
                "<p>\n" +
                "Ah, distinctly I remember it was in the bleak December,<br>\n" +
                "And each separate dying ember wrought its ghost upon the floor.<br>\n" +
                "Eagerly I wished the morrow;—vainly I had sought to borrow<br>\n" +
                "From my books surcease of sorrow—sorrow for the lost Lenore—<br>\n" +
                "For the rare and radiant maiden whom the angels name Lenore—<br>\n" +
                "<span style=\"margin-left: 20%\">Nameless here for evermore.</span>\n" +
                "</p>\n" +
                "\n" +
                "<p>\n" +
                "And the silken sad uncertain rustling of each purple curtain<br>\n" +
                "Thrilled me—filled me with fantastic terrors never felt before;<br>\n" +
                "So that now, to still the beating of my heart, I stood repeating<br>\n" +
                "“’Tis some visiter entreating entrance at my chamber door—<br>\n" +
                "Some late visiter entreating entrance at my chamber door;<br>\n" +
                "<span style=\"margin-left: 20%\">This it is and nothing more.”</span>\n" +
                "</p>\n" +
                "\n" +
                "<p>\n" +
                "Presently my soul grew stronger; hesitating then no longer,<br>\n" +
                "“Sir,” said I, “or Madam, truly your forgiveness I implore;<br>\n" +
                "But the fact is I was napping, and so gently you came rapping,<br>\n" +
                "And so faintly you came tapping, tapping at my chamber door,<br>\n" +
                "That I scarce was sure I heard you”—here I opened wide the door—<br>\n" +
                "<span style=\"margin-left: 20%\">Darkness there and nothing more.</span>\n" +
                "</p>\n" +
                "\n" +
                "<p>\n" +
                "Deep into that darkness peering, long I stood there wondering, fearing,<br>\n" +
                "Doubting, dreaming dreams no mortals ever dared to dream before;<br>\n" +
                "But the silence was unbroken, and the stillness gave no token,<br>\n" +
                "And the only word there spoken was the whispered word, “Lenore?”<br>\n" +
                "This I whispered, and an echo murmured back the word, “Lenore!”—<br>\n" +
                "<span style=\"margin-left: 20%\">Merely this and nothing more.</span>\n" +
                "</p>\n" +
                "\n" +
                "<p>\n" +
                "Back into the chamber turning, all my soul within me burning,<br>\n" +
                "Soon again I heard a tapping something louder than before.<br>\n" +
                "“Surely,” said I, “surely that is something at my window lattice;<br>\n" +
                "Let me see, then, what thereat is and this mystery explore—<br>\n" +
                "Let my heart be still a moment and this mystery explore;—<br>\n" +
                "<span style=\"margin-left: 20%\">’Tis the wind and nothing more.”</span>\n" +
                "</p>\n" +
                "\n" +
                "<p>\n" +
                "Open here I flung the shutter, when, with many a flirt and flutter,<br>\n" +
                "In there stepped a stately Raven of the saintly days of yore.<br>\n" +
                "Not the least obeisance made he; not a minute stopped or stayed he,<br>\n" +
                "But, with mien of lord or lady, perched above my chamber door—<br>\n" +
                "Perched upon a bust of Pallas just above my chamber door—<br>\n" +
                "<span style=\"margin-left: 20%\">Perched, and sat, and nothing more.</span>\n" +
                "</p>\n" +
                "\n" +
                "<p>\n" +
                "Then the ebony bird beguiling my sad fancy into smiling,<br>\n" +
                "By the grave and stern decorum of the countenance it wore,<br>\n" +
                "“Though thy crest be shorn and shaven, thou,” I said, “art sure no craven,<br>\n" +
                "Ghastly grim and ancient Raven wandering from the Nightly shore—<br>\n" +
                "Tell me what thy lordly name is on the Night’s Plutonian shore!”<br>\n" +
                "<span style=\"margin-left: 20%\">Quoth the Raven, “Nevermore.”</span>\n" +
                "</p>\n" +
                "\n" +
                "<p>\n" +
                "Much I marvelled this ungainly fowl to hear discourse so plainly,<br>\n" +
                "Though its answer little meaning—little relevancy bore;<br>\n" +
                "For we cannot help agreeing that no living human being<br>\n" +
                "Ever yet was blessed with seeing bird above his chamber door—<br>\n" +
                "Bird or beast upon the sculptured bust above his chamber door,<br>\n" +
                "<span style=\"margin-left: 20%\">With such name as “Nevermore.”</span>\n" +
                "</p>\n" +
                "\n" +
                "<p>\n" +
                "But the Raven, sitting lonely on that placid bust, spoke only<br>\n" +
                "That one word, as if its soul in that one word he did outpour<br>\n" +
                "Nothing farther then he uttered; not a feather then he fluttered—<br>\n" +
                "Till I scarcely more than muttered: “Other friends have flown before—<br>\n" +
                "On the morrow <i>he</i> will leave me, as my Hopes have flown before.”<br>\n" +
                "<span style=\"margin-left: 20%\">Then the bird said “Nevermore.”</span>\n" +
                "</p>\n" +
                "\n" +
                "<p>\n" +
                "Startled at the stillness broken by reply so aptly spoken,<br>\n" +
                "“Doubtless,” said I, “what it utters is its only stock and store,<br>\n" +
                "Caught from some unhappy master whom unmerciful Disaster<br>\n" +
                "Followed fast and followed faster till his songs one burden bore—<br>\n" +
                "Till the dirges of his Hope that melancholy burden bore<br>\n" +
                "<span style=\"margin-left: 20%\">Of ‘Never—nevermore.’”</span>\n" +
                "</p>\n" +
                "\n" +
                "<p>\n" +
                "But the Raven still beguiling all my sad soul into smiling,<br>\n" +
                "Straight I wheeled a cushioned seat in front of bird and bust and door;<br>\n" +
                "Then, upon the velvet sinking, I betook myself to linking<br>\n" +
                "Fancy unto fancy, thinking what this ominous bird of yore—<br>\n" +
                "What this grim, ungainly, ghastly, gaunt, and ominous bird of yore<br>\n" +
                "<span style=\"margin-left: 20%\">Meant in croaking “Nevermore.”</span>\n" +
                "</p>\n" +
                "\n" +
                "<p>\n" +
                "This I sat engaged in guessing, but no syllable expressing<br>\n" +
                "To the fowl whose fiery eyes now burned into my bosom’s core;<br>\n" +
                "This and more I sat divining, with my head at ease reclining<br>\n" +
                "On the cushion’s velvet lining that the lamp-light gloated o’er,<br>\n" +
                "But whose velvet violet lining with the lamp-light gloating o’er<br>\n" +
                "<span style=\"margin-left: 20%\"><i>She</i> shall press, ah, nevermore!</span>\n" +
                "</p>\n" +
                "\n" +
                "<p>\n" +
                "Then, methought, the air grew denser, perfumed from an unseen censer<br>\n" +
                "Swung by Seraphim whose foot-falls tinkled on the tufted floor.<br>\n" +
                "“Wretch,” I cried, “thy God hath lent thee—by these angels he hath sent thee<br>\n" +
                "Respite—respite and nepenthe from thy memories of Lenore!<br>\n" +
                "Quaff, oh quaff this kind nepenthe and forget this lost Lenore!”<br>\n" +
                "<span style=\"margin-left: 20%\">Quoth the Raven, “Nevermore.”</span>\n" +
                "</p>\n" +
                "\n" +
                "<p>\n" +
                "“Prophet!” said I, “thing of evil!—prophet still, if bird or devil!—<br>\n" +
                "Whether Tempter sent, or whether tempest tossed thee here ashore,<br>\n" +
                "Desolate, yet all undaunted, on this desert land enchanted—<br>\n" +
                "On this home by Horror haunted—tell me truly, I implore—<br>\n" +
                "Is there—<i>is</i> there balm in Gilead?—tell me—tell me, I implore!”<br>\n" +
                "<span style=\"margin-left: 20%\">Quoth the Raven, “Nevermore.”</span>\n" +
                "</p>\n" +
                "\n" +
                "<p>\n" +
                "“Prophet!” said I, “thing of evil!—prophet still, if bird or devil!<br>\n" +
                "By that Heaven that bends above us—by that God we both adore—<br>\n" +
                "Tell this soul with sorrow laden if, within the distant Aidenn,<br>\n" +
                "It shall clasp a sainted maiden whom the angels name Lenore—<br>\n" +
                "Clasp a rare and radiant maiden whom the angels name Lenore.”<br>\n" +
                "<span style=\"margin-left: 20%\">Quoth the Raven, “Nevermore.”</span>\n" +
                "</p>\n" +
                "\n" +
                "<p>\n" +
                "“Be that our sign of parting, bird or fiend!” I shrieked, upstarting—<br>\n" +
                "“Get thee back into the tempest and the Night’s Plutonian shore!<br>\n" +
                "Leave no black plume as a token of that lie thy soul has spoken!<br>\n" +
                "Leave my loneliness unbroken!—quit the bust above my door!<br>\n" +
                "Take thy beak from out my heart, and take thy form from off my door!”<br>\n" +
                "<span style=\"margin-left: 20%\">Quoth the Raven, “Nevermore.”</span>\n" +
                "</p>\n" +
                "\n" +
                "<p>\n" +
                "And the Raven, never flitting, still is sitting, still is sitting<br>\n" +
                "On the pallid bust of Pallas just above my chamber door;<br>\n" +
                "And his eyes have all the seeming of a demon’s that is dreaming<br>\n" +
                "And the lamp-light o’er him streaming throws his shadows on the floor;<br>\n" +
                "And my soul from out that shadow that lies floating on the floor<br>\n" +
                "<span style=\"margin-left: 20%\">Shall be lifted—nevermore!</span>\n" +
                "</p>\n" +
                "\n" +
                "</div><!--end chapter-->\n" +
                "\n" +
                "<div style=\"display:block; margin-top:4em\">*** END OF THE PROJECT GUTENBERG EBOOK THE RAVEN ***</div>\n" +
                "<div style=\"text-align:left\">\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "Updated editions will replace the previous one—the old editions will\n" +
                "be renamed.\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "Creating the works from print editions not protected by U.S. copyright\n" +
                "law means that no one owns a United States copyright in these works,\n" +
                "so the Foundation (and you!) can copy and distribute it in the United\n" +
                "States without permission and without paying copyright\n" +
                "royalties. Special rules, set forth in the General Terms of Use part\n" +
                "of this license, apply to copying and distributing Project\n" +
                "Gutenberg™ electronic works to protect the PROJECT GUTENBERG™\n" +
                "concept and trademark. Project Gutenberg is a registered trademark,\n" +
                "and may not be used if you charge for an eBook, except by following\n" +
                "the terms of the trademark license, including paying royalties for use\n" +
                "of the Project Gutenberg trademark. If you do not charge anything for\n" +
                "copies of this eBook, complying with the trademark license is very\n" +
                "easy. You may use this eBook for nearly any purpose such as creation\n" +
                "of derivative works, reports, performances and research. Project\n" +
                "Gutenberg eBooks may be modified and printed and given away--you may\n" +
                "do practically ANYTHING in the United States with eBooks not protected\n" +
                "by U.S. copyright law. Redistribution is subject to the trademark\n" +
                "license, especially commercial redistribution.\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"margin:0.83em 0; font-size:1.1em; text-align:center\">START: FULL LICENSE<br>\n" +
                "<span style=\"font-size:smaller\">THE FULL PROJECT GUTENBERG LICENSE<br>\n" +
                "PLEASE READ THIS BEFORE YOU DISTRIBUTE OR USE THIS WORK</span>\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "To protect the Project Gutenberg™ mission of promoting the free\n" +
                "distribution of electronic works, by using or distributing this work\n" +
                "(or any other work associated in any way with the phrase “Project\n" +
                "Gutenberg”), you agree to comply with all the terms of the Full\n" +
                "Project Gutenberg™ License available with this file or online at\n" +
                "www.gutenberg.org/license.\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; font-size:1.1em; margin:1em 0; font-weight:bold\">\n" +
                "Section 1. General Terms of Use and Redistributing Project Gutenberg™ electronic works\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "1.A. By reading or using any part of this Project Gutenberg™\n" +
                "electronic work, you indicate that you have read, understand, agree to\n" +
                "and accept all the terms of this license and intellectual property\n" +
                "(trademark/copyright) agreement. If you do not agree to abide by all\n" +
                "the terms of this agreement, you must cease using and return or\n" +
                "destroy all copies of Project Gutenberg™ electronic works in your\n" +
                "possession. If you paid a fee for obtaining a copy of or access to a\n" +
                "Project Gutenberg™ electronic work and you do not agree to be bound\n" +
                "by the terms of this agreement, you may obtain a refund from the person\n" +
                "or entity to whom you paid the fee as set forth in paragraph 1.E.8.\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "1.B. “Project Gutenberg” is a registered trademark. It may only be\n" +
                "used on or associated in any way with an electronic work by people who\n" +
                "agree to be bound by the terms of this agreement. There are a few\n" +
                "things that you can do with most Project Gutenberg™ electronic works\n" +
                "even without complying with the full terms of this agreement. See\n" +
                "paragraph 1.C below. There are a lot of things you can do with Project\n" +
                "Gutenberg™ electronic works if you follow the terms of this\n" +
                "agreement and help preserve free future access to Project Gutenberg™\n" +
                "electronic works. See paragraph 1.E below.\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "1.C. The Project Gutenberg Literary Archive Foundation (“the\n" +
                "Foundation” or PGLAF), owns a compilation copyright in the collection\n" +
                "of Project Gutenberg™ electronic works. Nearly all the individual\n" +
                "works in the collection are in the public domain in the United\n" +
                "States. If an individual work is unprotected by copyright law in the\n" +
                "United States and you are located in the United States, we do not\n" +
                "claim a right to prevent you from copying, distributing, performing,\n" +
                "displaying or creating derivative works based on the work as long as\n" +
                "all references to Project Gutenberg are removed. Of course, we hope\n" +
                "that you will support the Project Gutenberg™ mission of promoting\n" +
                "free access to electronic works by freely sharing Project Gutenberg™\n" +
                "works in compliance with the terms of this agreement for keeping the\n" +
                "Project Gutenberg™ name associated with the work. You can easily\n" +
                "comply with the terms of this agreement by keeping this work in the\n" +
                "same format with its attached full Project Gutenberg™ License when\n" +
                "you share it without charge with others.\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "1.D. The copyright laws of the place where you are located also govern\n" +
                "what you can do with this work. Copyright laws in most countries are\n" +
                "in a constant state of change. If you are outside the United States,\n" +
                "check the laws of your country in addition to the terms of this\n" +
                "agreement before downloading, copying, displaying, performing,\n" +
                "distributing or creating derivative works based on this work or any\n" +
                "other Project Gutenberg™ work. The Foundation makes no\n" +
                "representations concerning the copyright status of any work in any\n" +
                "country other than the United States.\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "1.E. Unless you have removed all references to Project Gutenberg:\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "1.E.1. The following sentence, with active links to, or other\n" +
                "immediate access to, the full Project Gutenberg™ License must appear\n" +
                "prominently whenever any copy of a Project Gutenberg™ work (any work\n" +
                "on which the phrase “Project Gutenberg” appears, or with which the\n" +
                "phrase “Project Gutenberg” is associated) is accessed, displayed,\n" +
                "performed, viewed, copied or distributed:\n" +
                "</div>\n" +
                "\n" +
                "<blockquote>\n" +
                "  <div style=\"display:block; margin:1em 0\">\n" +
                "    This eBook is for the use of anyone anywhere in the United States and most\n" +
                "    other parts of the world at no cost and with almost no restrictions\n" +
                "    whatsoever. You may copy it, give it away or re-use it under the terms\n" +
                "    of the Project Gutenberg License included with this eBook or online\n" +
                "    at <a href=\"https://www.gutenberg.org/\">www.gutenberg.org</a>. If you\n" +
                "    are not located in the United States, you will have to check the laws\n" +
                "    of the country where you are located before using this eBook.\n" +
                "  </div>\n" +
                "</blockquote>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "1.E.2. If an individual Project Gutenberg™ electronic work is\n" +
                "derived from texts not protected by U.S. copyright law (does not\n" +
                "contain a notice indicating that it is posted with permission of the\n" +
                "copyright holder), the work can be copied and distributed to anyone in\n" +
                "the United States without paying any fees or charges. If you are\n" +
                "redistributing or providing access to a work with the phrase “Project\n" +
                "Gutenberg” associated with or appearing on the work, you must comply\n" +
                "either with the requirements of paragraphs 1.E.1 through 1.E.7 or\n" +
                "obtain permission for the use of the work and the Project Gutenberg™\n" +
                "trademark as set forth in paragraphs 1.E.8 or 1.E.9.\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "1.E.3. If an individual Project Gutenberg™ electronic work is posted\n" +
                "with the permission of the copyright holder, your use and distribution\n" +
                "must comply with both paragraphs 1.E.1 through 1.E.7 and any\n" +
                "additional terms imposed by the copyright holder. Additional terms\n" +
                "will be linked to the Project Gutenberg™ License for all works\n" +
                "posted with the permission of the copyright holder found at the\n" +
                "beginning of this work.\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "1.E.4. Do not unlink or detach or remove the full Project Gutenberg™\n" +
                "License terms from this work, or any files containing a part of this\n" +
                "work or any other work associated with Project Gutenberg™.\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "1.E.5. Do not copy, display, perform, distribute or redistribute this\n" +
                "electronic work, or any part of this electronic work, without\n" +
                "prominently displaying the sentence set forth in paragraph 1.E.1 with\n" +
                "active links or immediate access to the full terms of the Project\n" +
                "Gutenberg™ License.\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "1.E.6. You may convert to and distribute this work in any binary,\n" +
                "compressed, marked up, nonproprietary or proprietary form, including\n" +
                "any word processing or hypertext form. However, if you provide access\n" +
                "to or distribute copies of a Project Gutenberg™ work in a format\n" +
                "other than “Plain Vanilla ASCII” or other format used in the official\n" +
                "version posted on the official Project Gutenberg™ website\n" +
                "(www.gutenberg.org), you must, at no additional cost, fee or expense\n" +
                "to the user, provide a copy, a means of exporting a copy, or a means\n" +
                "of obtaining a copy upon request, of the work in its original “Plain\n" +
                "Vanilla ASCII” or other form. Any alternate format must include the\n" +
                "full Project Gutenberg™ License as specified in paragraph 1.E.1.\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "1.E.7. Do not charge a fee for access to, viewing, displaying,\n" +
                "performing, copying or distributing any Project Gutenberg™ works\n" +
                "unless you comply with paragraph 1.E.8 or 1.E.9.\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "1.E.8. You may charge a reasonable fee for copies of or providing\n" +
                "access to or distributing Project Gutenberg™ electronic works\n" +
                "provided that:\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"margin-left:0.7em;\">\n" +
                "    <div style=\"text-indent:-0.7em\">\n" +
                "        • You pay a royalty fee of 20% of the gross profits you derive from\n" +
                "        the use of Project Gutenberg™ works calculated using the method\n" +
                "        you already use to calculate your applicable taxes. The fee is owed\n" +
                "        to the owner of the Project Gutenberg™ trademark, but he has\n" +
                "        agreed to donate royalties under this paragraph to the Project\n" +
                "        Gutenberg Literary Archive Foundation. Royalty payments must be paid\n" +
                "        within 60 days following each date on which you prepare (or are\n" +
                "        legally required to prepare) your periodic tax returns. Royalty\n" +
                "        payments should be clearly marked as such and sent to the Project\n" +
                "        Gutenberg Literary Archive Foundation at the address specified in\n" +
                "        Section 4, “Information about donations to the Project Gutenberg\n" +
                "        Literary Archive Foundation.”\n" +
                "    </div>\n" +
                "\n" +
                "    <div style=\"text-indent:-0.7em\">\n" +
                "        • You provide a full refund of any money paid by a user who notifies\n" +
                "        you in writing (or by e-mail) within 30 days of receipt that s/he\n" +
                "        does not agree to the terms of the full Project Gutenberg™\n" +
                "        License. You must require such a user to return or destroy all\n" +
                "        copies of the works possessed in a physical medium and discontinue\n" +
                "        all use of and all access to other copies of Project Gutenberg™\n" +
                "        works.\n" +
                "    </div>\n" +
                "\n" +
                "    <div style=\"text-indent:-0.7em\">\n" +
                "        • You provide, in accordance with paragraph 1.F.3, a full refund of\n" +
                "        any money paid for a work or a replacement copy, if a defect in the\n" +
                "        electronic work is discovered and reported to you within 90 days of\n" +
                "        receipt of the work.\n" +
                "    </div>\n" +
                "\n" +
                "    <div style=\"text-indent:-0.7em\">\n" +
                "        • You comply with all other terms of this agreement for free\n" +
                "        distribution of Project Gutenberg™ works.\n" +
                "    </div>\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "1.E.9. If you wish to charge a fee or distribute a Project\n" +
                "Gutenberg™ electronic work or group of works on different terms than\n" +
                "are set forth in this agreement, you must obtain permission in writing\n" +
                "from the Project Gutenberg Literary Archive Foundation, the manager of\n" +
                "the Project Gutenberg™ trademark. Contact the Foundation as set\n" +
                "forth in Section 3 below.\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "1.F.\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "1.F.1. Project Gutenberg volunteers and employees expend considerable\n" +
                "effort to identify, do copyright research on, transcribe and proofread\n" +
                "works not protected by U.S. copyright law in creating the Project\n" +
                "Gutenberg™ collection. Despite these efforts, Project Gutenberg™\n" +
                "electronic works, and the medium on which they may be stored, may\n" +
                "contain “Defects,” such as, but not limited to, incomplete, inaccurate\n" +
                "or corrupt data, transcription errors, a copyright or other\n" +
                "intellectual property infringement, a defective or damaged disk or\n" +
                "other medium, a computer virus, or computer codes that damage or\n" +
                "cannot be read by your equipment.\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "1.F.2. LIMITED WARRANTY, DISCLAIMER OF DAMAGES - Except for the “Right\n" +
                "of Replacement or Refund” described in paragraph 1.F.3, the Project\n" +
                "Gutenberg Literary Archive Foundation, the owner of the Project\n" +
                "Gutenberg™ trademark, and any other party distributing a Project\n" +
                "Gutenberg™ electronic work under this agreement, disclaim all\n" +
                "liability to you for damages, costs and expenses, including legal\n" +
                "fees. YOU AGREE THAT YOU HAVE NO REMEDIES FOR NEGLIGENCE, STRICT\n" +
                "LIABILITY, BREACH OF WARRANTY OR BREACH OF CONTRACT EXCEPT THOSE\n" +
                "PROVIDED IN PARAGRAPH 1.F.3. YOU AGREE THAT THE FOUNDATION, THE\n" +
                "TRADEMARK OWNER, AND ANY DISTRIBUTOR UNDER THIS AGREEMENT WILL NOT BE\n" +
                "LIABLE TO YOU FOR ACTUAL, DIRECT, INDIRECT, CONSEQUENTIAL, PUNITIVE OR\n" +
                "INCIDENTAL DAMAGES EVEN IF YOU GIVE NOTICE OF THE POSSIBILITY OF SUCH\n" +
                "DAMAGE.\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "1.F.3. LIMITED RIGHT OF REPLACEMENT OR REFUND - If you discover a\n" +
                "defect in this electronic work within 90 days of receiving it, you can\n" +
                "receive a refund of the money (if any) you paid for it by sending a\n" +
                "written explanation to the person you received the work from. If you\n" +
                "received the work on a physical medium, you must return the medium\n" +
                "with your written explanation. The person or entity that provided you\n" +
                "with the defective work may elect to provide a replacement copy in\n" +
                "lieu of a refund. If you received the work electronically, the person\n" +
                "or entity providing it to you may choose to give you a second\n" +
                "opportunity to receive the work electronically in lieu of a refund. If\n" +
                "the second copy is also defective, you may demand a refund in writing\n" +
                "without further opportunities to fix the problem.\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "1.F.4. Except for the limited right of replacement or refund set forth\n" +
                "in paragraph 1.F.3, this work is provided to you ‘AS-IS’, WITH NO\n" +
                "OTHER WARRANTIES OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT\n" +
                "LIMITED TO WARRANTIES OF MERCHANTABILITY OR FITNESS FOR ANY PURPOSE.\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "1.F.5. Some states do not allow disclaimers of certain implied\n" +
                "warranties or the exclusion or limitation of certain types of\n" +
                "damages. If any disclaimer or limitation set forth in this agreement\n" +
                "violates the law of the state applicable to this agreement, the\n" +
                "agreement shall be interpreted to make the maximum disclaimer or\n" +
                "limitation permitted by the applicable state law. The invalidity or\n" +
                "unenforceability of any provision of this agreement shall not void the\n" +
                "remaining provisions.\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "1.F.6. INDEMNITY - You agree to indemnify and hold the Foundation, the\n" +
                "trademark owner, any agent or employee of the Foundation, anyone\n" +
                "providing copies of Project Gutenberg™ electronic works in\n" +
                "accordance with this agreement, and any volunteers associated with the\n" +
                "production, promotion and distribution of Project Gutenberg™\n" +
                "electronic works, harmless from all liability, costs and expenses,\n" +
                "including legal fees, that arise directly or indirectly from any of\n" +
                "the following which you do or cause to occur: (a) distribution of this\n" +
                "or any Project Gutenberg™ work, (b) alteration, modification, or\n" +
                "additions or deletions to any Project Gutenberg™ work, and (c) any\n" +
                "Defect you cause.\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; font-size:1.1em; margin:1em 0; font-weight:bold\">\n" +
                "Section 2. Information about the Mission of Project Gutenberg™\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "Project Gutenberg™ is synonymous with the free distribution of\n" +
                "electronic works in formats readable by the widest variety of\n" +
                "computers including obsolete, old, middle-aged and new computers. It\n" +
                "exists because of the efforts of hundreds of volunteers and donations\n" +
                "from people in all walks of life.\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "Volunteers and financial support to provide volunteers with the\n" +
                "assistance they need are critical to reaching Project Gutenberg™’s\n" +
                "goals and ensuring that the Project Gutenberg™ collection will\n" +
                "remain freely available for generations to come. In 2001, the Project\n" +
                "Gutenberg Literary Archive Foundation was created to provide a secure\n" +
                "and permanent future for Project Gutenberg™ and future\n" +
                "generations. To learn more about the Project Gutenberg Literary\n" +
                "Archive Foundation and how your efforts and donations can help, see\n" +
                "Sections 3 and 4 and the Foundation information page at www.gutenberg.org.\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; font-size:1.1em; margin:1em 0; font-weight:bold\">\n" +
                "Section 3. Information about the Project Gutenberg Literary Archive Foundation\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "The Project Gutenberg Literary Archive Foundation is a non-profit\n" +
                "501(c)(3) educational corporation organized under the laws of the\n" +
                "state of Mississippi and granted tax exempt status by the Internal\n" +
                "Revenue Service. The Foundation’s EIN or federal tax identification\n" +
                "number is 64-6221541. Contributions to the Project Gutenberg Literary\n" +
                "Archive Foundation are tax deductible to the full extent permitted by\n" +
                "U.S. federal laws and your state’s laws.\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "The Foundation’s business office is located at 809 North 1500 West,\n" +
                "Salt Lake City, UT 84116, (801) 596-1887. Email contact links and up\n" +
                "to date contact information can be found at the Foundation’s website\n" +
                "and official page at www.gutenberg.org/contact\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; font-size:1.1em; margin:1em 0; font-weight:bold\">\n" +
                "Section 4. Information about Donations to the Project Gutenberg Literary Archive Foundation\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "Project Gutenberg™ depends upon and cannot survive without widespread\n" +
                "public support and donations to carry out its mission of\n" +
                "increasing the number of public domain and licensed works that can be\n" +
                "freely distributed in machine-readable form accessible by the widest\n" +
                "array of equipment including outdated equipment. Many small donations\n" +
                "($1 to $5,000) are particularly important to maintaining tax exempt\n" +
                "status with the IRS.\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "The Foundation is committed to complying with the laws regulating\n" +
                "charities and charitable donations in all 50 states of the United\n" +
                "States. Compliance requirements are not uniform and it takes a\n" +
                "considerable effort, much paperwork and many fees to meet and keep up\n" +
                "with these requirements. We do not solicit donations in locations\n" +
                "where we have not received written confirmation of compliance. To SEND\n" +
                "DONATIONS or determine the status of compliance for any particular state\n" +
                "visit <a href=\"https://www.gutenberg.org/donate/\">www.gutenberg.org/donate</a>.\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "While we cannot and do not solicit contributions from states where we\n" +
                "have not met the solicitation requirements, we know of no prohibition\n" +
                "against accepting unsolicited donations from donors in such states who\n" +
                "approach us with offers to donate.\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "International donations are gratefully accepted, but we cannot make\n" +
                "any statements concerning tax treatment of donations received from\n" +
                "outside the United States. U.S. laws alone swamp our small staff.\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "Please check the Project Gutenberg web pages for current donation\n" +
                "methods and addresses. Donations are accepted in a number of other\n" +
                "ways including checks, online payments and credit card donations. To\n" +
                "donate, please visit: www.gutenberg.org/donate\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; font-size:1.1em; margin:1em 0; font-weight:bold\">\n" +
                "Section 5. General Information About Project Gutenberg™ electronic works\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "Professor Michael S. Hart was the originator of the Project\n" +
                "Gutenberg™ concept of a library of electronic works that could be\n" +
                "freely shared with anyone. For forty years, he produced and\n" +
                "distributed Project Gutenberg™ eBooks with only a loose network of\n" +
                "volunteer support.\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "Project Gutenberg™ eBooks are often created from several printed\n" +
                "editions, all of which are confirmed as not protected by copyright in\n" +
                "the U.S. unless a copyright notice is included. Thus, we do not\n" +
                "necessarily keep eBooks in compliance with any particular paper\n" +
                "edition.\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "Most people start at our website which has the main PG search\n" +
                "facility: <a href=\"https://www.gutenberg.org/\">www.gutenberg.org</a>.\n" +
                "</div>\n" +
                "\n" +
                "<div style=\"display:block; margin:1em 0\">\n" +
                "This website includes information about Project Gutenberg™,\n" +
                "including how to make donations to the Project Gutenberg Literary\n" +
                "Archive Foundation, how to help produce our new eBooks, and how to\n" +
                "subscribe to our email newsletter to hear about new eBooks.\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "</body></html>\n";
        PoemParser poemParser = new PoemParser();
        assertEquals(poemParser.getHTMLAsString("src/test/The Project Gutenberg eBook of The Raven, by Edgar Allan Poe.htm"), (poemText));
    }
}
