# Gas usage assignment
This is an assignment I made during college. This assignment focuses on the gas usage program where a user is prompted to enter their name and KWH usage. Then the program will develop an expected annual cost of each of the four suppliers: SSE electricity, Flogas, Electric Ireland and Prepay Power. 


**Algorithm:**
OUTPUT "Enter the name of the customer:"
INPUT customer's name and store it in the variable customerName.
OUTPUT "Enter your annual Kwh gas usage:"
INPUT annual kWh gas usage and store it in the variable KwhUsage.
SET CF as a DecimalFormat for currency with the format " ###,###.00" to be used later.
SET CarbonTax = 0.877 and VatTax = 0.09.

SSE ELECTRICTY:
SET SSE Electricity unit rate = 10.91
SET SSE Electricity standing charge = €139.92
SET SSE Electricity Unit Cost = (KwhUsage * SSElectricity Unit rate) / 100
SET SSE Electricity carbon tax = (KwhUsage * CarbonTax) / 100.
SET SSE Electricity VAT= VatTax * (SSE electricity standing charge+ SSE electricity unit cost + SSEelectricity carbon tax).
SET SSE ELECTRICITY TOTAL COST = SSE electricity standing charge+ SSE electricity unit cost + sse
electricity carbon tax + SSE electricity vat.

FLOGAS:
SET FLOGAS UNIT RATE = 9.95
SET FLOGAS STANDING CHARGE = 154.12.
SET FLOGAS UNIT COST = (KwhUsage * FLOGAS UNIT RATE) / 100.
SET FLOGAS CARBON TAX = (KwhUsage * CarbonTax) / 100.
SET FLOGAS VAT = VatTax * (FLOGAS STANDING CHARGE + FLOGAS UNIT COST + FLOGAS CARBON TAX)
SET FLOGAS TOTAL COST = FLOGAS STANDING CHARGE + FLOGAS UNIT COST + FLOGAS CARBON TAX + FLOGAS VAT.

Electric Ireland:
SET ELECTRIC IRELAND UNIT RATE = 12.72
SET ELECTRIC IRELAND STANDING CHARGE = 152.19.
SET ELECTRIC IRELAND UNIT COST = (KwhUsage * ELECTRIC IRELAND UNIT RATE) / 100.
SET ELECTRIC IRELAND CARBON TAX = (KwhUsage * CarbonTax) / 100.
SET ELECTRIC IRELAND VAT = VatTax * (ELECTRIC IRELAND STANDING CHARGE + ELECTRIC IRELAND UNIT COST + ELECTRIC IRELAND CARBON TAX).
SET ELECTRIC IRELAND TOTAL COST = ELECTRIC IRELAND STANDING CHARGE + ELECTRIC IRELAND UNIT COST + ELECTRIC IRELAND CARBON TAX + ELECTRIC IRELAND VAT.

PrePayPower:
SET PPREPAYPOWER UNIT RATE = 13.09
SET PREPAYPOWER STANDING CHARGE = 142.81.
SET PPREPAYPOWER UNIT COST = (KwhUsage * PPREPAYPOWE UNIT RATE) / 100.
SET PPREPAYPOWER CARBON TAX = (KwhUsage * CarbonTax) / 100.
SET PPREPAYPOWER VAT = VatTax * (PPREPAYPOWER STANDING CHARGE + PPREPAYPOWER UNIT COST + PPREPAYPOWER CARBON TAX).
SET PPREPAYPOWER TOTAL COST = PPREPAYPOWER STANDING CHARGE + PPREPAYPOWER UNIT COST + PPREPAYPOWER CARBON TAX + PPREPAYPOWER VAT.

OUTPUT "Estimated annual gas cost for " + customerName + " based on " + KwhUsage + " kWh annual usage."
OUTPUT Top border of the table.
OUTPUT │ %-22s%-22s%-22s%-22s%-22s%-23s │" first row formatted with: "Supplier", "Standing Charge", "Unit Cost", "Carbon Tax", "VAT", "Total Cost".
OUTPUT │ %-22s%-22s%-22s%-22s%-22s%-23s │" formatted with SSE Electricity", "€139.92", SSE ELECTRICITY UNIT COST, SSE ELECTRICITY CARBON TAX, SSE ELECTRICITY VAT, SSE ELECTRICITY TOTAL COST
OUTPUT │ %-22s%-22s%-22s%-22s%-22s%-23s │" formatted with: FloGas", "€154.12", FLOGAS UNIT COST, FLOGAS CARBON TAX, FLOGAS VAT, FLOGAS TOTAL COST
OUTPUT │ %-22s%-22s%-22s%-22s%-22s%-23s │" formatted with: Electric Ireland", "€152.19", ELECTRIC IRELAND UNIT COST, ELECTRIC IRELAND CARBON TAX, ELECTRIC IRELAND VAT, ELECTRIC IRELAND TOTAL COST
OUTPUT │ %-22s%-22s%-22s%-22s%-22s%-23s │" formatted with: PrePayPower", "€142.81", PPREPAYPOWER UNIT COST, PPREPAYPOWER CARBON TAX, PPREPAYPOWER VAT, PPREPAYPOWER TOTAL COST 
