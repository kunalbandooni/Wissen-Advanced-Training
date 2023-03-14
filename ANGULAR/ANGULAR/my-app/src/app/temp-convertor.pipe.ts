import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'tempConvertor'
})
export class TempConvertorPipe implements PipeTransform {

  transform(nData: number, strAction: string): number {
    let nConvertedData = 0;

    if(strAction == "ToCelsius")
      nConvertedData = (nData - 32) / 1.8;
    else if (strAction == "ToFarenheit")
      nConvertedData = nData * 1.8 + 32;

    return nConvertedData;
  }

}
