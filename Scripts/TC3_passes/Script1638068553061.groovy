import com.kazurayam.ks.main.ShouldBreak
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

if (ShouldBreak.check()) return;

WebUI.comment("TC3 ran")

for (int i in 1..3) {
	WebUI.comment("TC3 is doing a heavy task: ${i}")
}